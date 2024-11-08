//package com.design_shinbi.trivia_numa.test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.security.NoSuchAlgorithmException;
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//
//import com.design_shinbi.trivia_numa.model.Dao.HobbyDAO;
//import com.design_shinbi.trivia_numa.model.entity.User;
//import com.design_shinbi.trivia_numa.util.DbUtil;
//
//class HobbyTest {
//
//	@Test
//	void test() throws ClassNotFoundException, SQLException, NoSuchAlgorithmException {
//	Connection connection = DbUtil.connect(true);
//	HobbyDAO dao = new HobbyDAO(connection);
//	System.out.println("初期化");
//	List<User> users = dao.findHobby();
//	for (User user : users) {
//	dao.delete(user.getId());
//	}
//	List<User> objects = new ArrayList<User>();
//	objects.add(new User("玉井詩織", 1));
//	objects.add(new User("百田夏菜子",2));
//	objects.add(new User("有安杏果", 3));
//	objects.add(new User("佐々木彩夏",4));
//	objects.add(new User("高城れに", 5));
//	System.out.println("追加テスト");
//	
//	for (User user : objects) {
//	dao.hobbyAdd(user.getName(), user.getScore());
//	}
//	users = dao.findHobby();
//	
//	if (!isSame(objects, users)) {
//	fail("登録に失敗しました。");
//	}
//	connection.close();
//	}
//	
//	
//	public boolean isSame(List<User> objects, List<User> users)
//	throws NoSuchAlgorithmException {
//	if (objects.size() != users.size()) {
//	return false;
//	}
//	for (int i = 0; i < objects.size(); i++) {User object = objects.get(i);
//	User user = users.get(i);
//	System.out.println(user);
//	}
//	return true;
//	}
//}