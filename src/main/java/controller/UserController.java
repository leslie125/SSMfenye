package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import model.User;
import service.UserService;
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/queryUser")
	public ModelAndView queryItems() throws Exception
	{
		List<User> users=userService.findAll();
		System.out.println("users:"+users);
		ModelAndView modelAndView=new ModelAndView("index");
		modelAndView.addObject("UserList", users);
		return modelAndView;
		
	}
	@RequestMapping("/delete")
	public String deleteUser(@RequestParam(value="id") int id)throws Exception
	{
		System.out.println(id);
		userService.deleteUser(id);
		System.out.println("É¾³ý³É¹¦");
		return "redirect:/queryUser";		
		
	}
	@RequestMapping("/addUser")
	public String addUser(User user)throws Exception
	{
		System.out.println("user"+user);
		userService.addUser(user);
		return "redirect:/queryUser";	
	}
	@RequestMapping("/update")
	public String updateUser(@RequestParam(value="id") int id,Model model)throws Exception
	{
		User user=new User();
		user=userService.getUser(id);
		System.out.println("id:"+id);
		System.out.println("user:"+user);
		model.addAttribute("user", user);
		return "/update";
	}
	@RequestMapping("/updateUser")
	public String update(User user)throws Exception
	{
		System.out.println("user:"+user);
		userService.updateUser(user);
		return "redirect:/queryUser";
	}
	@RequestMapping("/index")
	public String selectbypage(@RequestParam(value="currentPage",defaultValue="1",required=false)int currentPage,Model model)
	{
		model.addAttribute("pagemsg", userService.findByPage(currentPage));
		return "index";
		
	}
}
