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
     //�����������
//     user.setId(5);
//     user.setUsername("Jessica");
//     user.setPassword("123");
//     userDao.addUser(user);
//     user.setId(6);
//     user.setUsername("Jessica2");
//     user.setPassword("123");
//     userDao.addUser(user);
//     System.out.println("��ӳɹ�");
     //��ѯ����
		System.out.println("���");
	 List<User> list=userServiceImpl.findAll();
	 System.out.println("list"+list.size());
	 System.out.println("list:"+list);
	 User user=new User();
	 user.setUsername("ppp");
	 user.setPassword("123");
	 userServiceImpl.addUser(user);
	 System.out.println("��ӳɹ�");
//     user.setUsername("Jessica");
//     user.setPassword("123");
//     List<User>users=userDao.getUser(user); 
//     System.out.println(userDao.getUser(user).toString());
//     user.setUsername("Jessica2");
//     user.setPassword("123");
//     System.out.println(userDao.getUser(user).toString());
//     //�޸�����
//     user.setId(3);
//     user.setPassword("802");
//     userDao.updateUser(user);
//     System.out.println("�޸ĳɹ�");
//     //ɾ������
//     userDao.deleteUser(1);
//     System.out.println("ɾ���ɹ�");
	}

}
