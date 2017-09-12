package service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.UserDao;
import model.PageBean;
import model.User;

public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;

	public List<User> findAll() throws Exception {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	public void addUser(User user) {
		userDao.addUser(user);
	}

	public void deleteUser(int UserId) {
		userDao.deleteUser(UserId);
		
	}

	public User getUser(int UserId) {
		
		return userDao.getUser(UserId);
	}

	public void updateUser(User user) {
		userDao.updateUser(user);
		
	}

	public PageBean<User> findByPage(int currentPage) {
			HashMap<String,Object> map=new HashMap<String,Object>();
			PageBean<User>pageBean=new PageBean<User>(); 
			pageBean.setCurrPage(currentPage);
			int pageSize=2;
			pageBean.setPageSize(pageSize);
			int totalCount=userDao.findAll().size();
			pageBean.setTotalCount(totalCount);
			double tc=totalCount;
			Double num=Math.ceil(tc/pageSize);
			pageBean.setTotalPage(num.intValue());
			map.put("start", (currentPage-1)*pageSize);
			map.put("size", pageBean.getPageSize());
			List<User>lists=userDao.findByPage(map) ;
			pageBean.setLists(lists);
			return pageBean;
	}



}
