package com.design_shinbi.trivia_numa.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import com.design_shinbi.trivia_numa.model.Dao.HobbyDAO;
import com.design_shinbi.trivia_numa.model.Dao.StudyDAO;
import com.design_shinbi.trivia_numa.model.entity.User;
import com.design_shinbi.trivia_numa.util.DbUtil;

public class SaveResultServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();    
        
        String save = request.getParameter("save");
        String error = "";

        // "no" が選ばれた場合は結果を削除して最初の画面に戻る
        if(save != null && save.equals("no")) {
            session.removeAttribute("result");
            session.removeAttribute("scoretype");
            RequestDispatcher dispatcher = request.getRequestDispatcher("start.jsp");
            dispatcher.forward(request, response);
            return;  // ここで処理を終了
        }
        
        // "yes" が選ばれた場合の処理
        Integer result = (Integer) session.getAttribute("result");
        String scoretype = (String) session.getAttribute("scoretype");

        // resultまたはscoretypeがnullの場合、エラーを返す
        if (result == null || scoretype == null) {
            error = "不正なリクエストです。もう一度最初からやり直してください。";
            request.setAttribute("error", error);
            RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
            dispatcher.forward(request, response);
            return;  // ここで処理を終了
        }

        // ユーザー名を取得し、未入力の場合はエラーを返す
        String name = request.getParameter("name");
        if (name == null || name.isEmpty()) {
            error = "名前を入力してください。";
            request.setAttribute("error", error);
            RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
            dispatcher.forward(request, response);
            return;  // ここで処理を終了
        }

        // 名前が入力されている場合、データベースに結果を保存
        if (error.isEmpty()) {
            try {
                Connection connection = DbUtil.connect();

                // スコアタイプに応じた処理を行う
                if(scoretype.equals("hobby_score")) {
                    HobbyDAO dao = new HobbyDAO(connection);
                    dao.hobbyAdd(name, result);  // 結果をデータベースに追加
                    List<User> ranking = dao.findHobby();  // ランキングを取得
                    request.setAttribute("ranking", ranking);  // ランキングをJSPに渡す
                } else if(scoretype.equals("study_score")) {
                    StudyDAO dao = new StudyDAO(connection);
                    dao.studyAdd(name, result);  // 結果をデータベースに追加
                    List<User> ranking = dao.findStudy();  // ランキングを取得
                    request.setAttribute("ranking", ranking);  // ランキングをJSPに渡す
                } else {
                    error = "不正なスコアタイプです。";
                    request.setAttribute("error", error);
                    RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
                    dispatcher.forward(request, response);
                    return;  // ここで処理を終了
                }

                connection.close();  // コネクションをクローズ

            } catch (Exception e) {
                error = "データベース接続エラーが発生しました。";
                request.setAttribute("error", error);
                // エラーをログに記録
                e.printStackTrace();
                RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
                dispatcher.forward(request, response);
                return;  // ここで処理を終了
            }
        }

        // 結果が保存されたら、セッションの値を削除
        session.removeAttribute("result");
        session.removeAttribute("scoretype");

        // 成功したら成功ページにフォワード
        RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
        dispatcher.forward(request, response);
    }
}
