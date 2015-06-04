package com.Action;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import com.Service.UserService;
import com.domain.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	private User user=new User();
	private List<User> userList;
	@Resource
	private UserService userService;
	public String execute()
	{

        System.out.println("aaaa");
		return "RegisteredYES";
	}
	public String login()//µÇÂ½
	{
		int is=userService.login(user);
		if(is!=1)
		{	
		 Map session=ActionContext.getContext().getSession();
		    session.put("User",user);
		  if(is==2)
		  {
			return "loginYES1";
		  }
		  else
		  {
			return "loginYES2";
		  }
		}
		else
		{
			return "loginNO";	
		}
	}
	public String Cancel()//×¢Ïú
	{
		Map session=ActionContext.getContext().getSession();
		session.remove("User");
		return "Cancel";
	}
	public String Registered()//×¢²á
	{
         System.out.println("aaaa");
		user.setUserName("1234567");
		user.setPassword("1234567");
		user.setName("1");
		user.setAddress("1");
		user.setGender("ÄÐ");
		if(userService.Registered(user))
		{
			return "RegisteredYES";
		}
		else
		{
			return "RegisteredNO";	
		}
	}
	public String Change()//ÐÞ¸Ä
	{
		if(userService.Change(user))
		{
			return "ChangeYES";
		}
		else
		{
			return "ChangeNO";	
		}
	}
	public String Delete()//É¾³ý
	{
		if(userService.Delete(user))
		{
			return "DeleteYES";
		}
		else
		{
			return "DeleteNO";	
		}
	}
	public String Query()//²éÑ¯
	{
		userList=userService.Query();
			return "Query";	
	}
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
