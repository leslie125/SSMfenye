package service;

import java.util.List;

import model.PageBean;
import model.User;

public interface UserService {
	public void addUser(User user);
	public void deleteUser(int UserId);
	public List<User> findAll() throws Exception;
	public User getUser(int UserId);
	public void updateUser(User user);
	public PageBean<User> findByPage(int currentPage);

}
