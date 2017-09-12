package test;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.apache.catalina.core.ApplicationContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dao.UserDao;
import model.User;
import service.UserServiceImpl;


@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml"})  
public class test3 {
	@Resource
	private UserServiceImpl userServiceImpl;
	@Test
	public void test() throws Exception {
		
//	ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
//	UserDao userDao=(UserDao) applicationContext.getBean("userDao");
//	List<User>users; 
//	 User user=new User();
     //添加两条数据
//     user.setId(5);
//     user.setUsername("Jessica");
//     user.setPassword("123");
//     userDao.addUser(user);
//     user.setId(6);
//     user.setUsername("Jessica2");
//     user.setPassword("123");
//     userDao.addUser(user);
//     System.out.println("添加成功");
     //查询数据
		System.out.println("添加");
	 List<User> list=userServiceImpl.findAll();
	 System.out.println("list"+list.size());
	 System.out.println("list:"+list);
	 User user=new User();
	 user.setUsername("ppp");
	 user.setPassword("123");
	 userServiceImpl.addUser(user);
	 System.out.println("添加成功");
//     user.setUsername("Jessica");
//     user.setPassword("123");
//     List<User>users=userDao.getUser(user); 
//     System.out.println(userDao.getUser(user).toString());
//     user.setUsername("Jessica2");
//     user.setPassword("123");
//     System.out.println(userDao.getUser(user).toString());
//     //修改数据
//     user.setId(3);
//     user.setPassword("802");
//     userDao.updateUser(user);
//     System.out.println("修改成功");
//     //删除数据
//     userDao.deleteUser(1);
//     System.out.println("删除成功");
	}

}
