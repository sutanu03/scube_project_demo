package com.sutanu.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sutanu.main.model.Quotation;
import com.sutanu.main.model.User;
import com.sutanu.main.repository.QuotationRepo;
import com.sutanu.main.repository.UserRepo;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class MainController {
	
	/*
	 * 
	 * 
	 * USER CRED OPERATION
	 * 
	 * 
	 * */
	
	@Autowired
	private UserRepo usr;
	
	// after giving all info and press registration button (from reg.html)
	//add user
		@PostMapping("/user/add")
		public String createUser(@RequestBody User user)
		{
			usr.save(user);
			//return "redirect:/login";
			return "Registered";
		}
		
		// read all user
		@GetMapping("/user/read/all")
		public List<User> readUser()
		{
			return usr.findAll();
		}
		
		// read user by email
		@GetMapping("/user/read/{a_email}")
		public Optional<User> readUserByEmail(@PathVariable("a_email") String a_email)
		{
			return usr.findById(a_email);
		}
		
		// update user
		@PostMapping("/user/update")
		public String updateUser(@RequestBody User user)
		{
			usr.save(user);
			return "Updated";
		}
		
		// delete user
		@GetMapping("/user/delete/{a_email}")
		public String deleteUserByEmail(@PathVariable("a_email") String a_email)
		{
			usr.deleteById(a_email);
			return "Deleted";
		}
			
		
		/*
		 * 
		 * 
		 * Quotation CRED OPERATION
		 * 
		 * 
		 * */
		
		@Autowired
		private QuotationRepo qr;
		
		//add quotation
			@PostMapping("/quote/add")
			public String createQuote(@RequestBody Quotation quote)
			{
				qr.save(quote);
				return "Quotation Created";
			}

}
