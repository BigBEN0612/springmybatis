package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import pojo.User;
import dao.IUserDao;

@Controller
public class UserController{
	
	@Autowired
	private IUserDao userDao;
	
	@RequestMapping(value="home")
	public String indexPage(){
		User u = userDao.getUser(2);
		System.out.println("name：" + u.getName());
		return "index"; 

	}
}
