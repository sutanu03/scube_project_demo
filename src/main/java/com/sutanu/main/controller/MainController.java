package com.sutanu.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sutanu.main.model.User;
import com.sutanu.main.repository.SupplierRepo;
import com.sutanu.main.repository.UserRepo;

@RestController
@RequestMapping("/api")
public class MainController {
	
	@Autowired
	UserRepo usr;
	
	@Autowired
	SupplierRepo supp;
	
	// after giving all info and press registration button (from reg.html)
		@PostMapping("/regUser")
		public String createUser(@ModelAttribute User user)
		{
			usr.save(user);
			return "redirect:/login";
		}

}
