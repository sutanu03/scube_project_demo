package com.sutanu.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sutanu.main.model.User;
import com.sutanu.main.repository.UserRepo;

@Controller
@ControllerAdvice
public class ControllerForUser {

	@Autowired
	UserRepo usr;
	
	//homePage
	@GetMapping("/login")
	public String loginPage()
	{
		return "loginUser.html";
	}
	
	//from login page to reg page
	@GetMapping("/toUserReg")
	public String toUserRegPage()
	{
		return "userReg.html";
	}
	
	//from reg page to login page
	@GetMapping("/toLoginUser")
	public String toLoginUserPage()
	{
		return "loginUser.html";
	}
	
	// after giving email id and password and press login (from loginUser.html)
	@PostMapping("/loginUser")
	public String loginUser(@RequestParam String a_email, String g_password1, Model m)
	{
		List<User> u = usr.findEmailAndPass(a_email, g_password1);
		m.addAttribute("user", u);
		if(a_email == "sutanughosal1@gmail.com" && g_password1 == "sutanu123")
		{
			return "dashboard.html";
		}
		else
		{
		//	return "redirect:/login";
			return "dashboard.html";
		}
	}
		
	
}
