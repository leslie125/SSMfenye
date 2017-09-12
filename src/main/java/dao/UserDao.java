package dao;

import java.util.HashMap;
import java.util.List;

import model.User;

public interface UserDao {
	  public User getUser(int UserId);
	  public void addUser(User user);
	  public void updateUser(User user);
	  public void deleteUser(int UserId);
	  public List<User> findAll();
	  public List<User> findByPage(HashMap<String, Object> map);
}
