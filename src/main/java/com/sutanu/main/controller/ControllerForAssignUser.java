package com.sutanu.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sutanu.main.model.AssignUser;
import com.sutanu.main.repository.AssignUserRepo;
import com.sutanu.main.repository.UserRepo;

//import ch.qos.logback.core.model.Model;

@Controller
@ControllerAdvice
public class ControllerForAssignUser {

	@Autowired
	AssignUserRepo aur;

	@Autowired
	UserRepo usr;

	// from cancel button in assignUser.html page
	@GetMapping("/cancelUserToSupp")
	public String cancelUserToSupp() {
		return "redirect:/redirectAssignUser";
	}
	
	// for one single user add to supplier
	@PostMapping("/addUserToSupp")
	public String addUserToSupp(@RequestParam("a_userEmail") String a_userEmail, @ModelAttribute AssignUser ausr) {
		
		if("uE1".equals(ausr))
			aur.save(ausr);
			return "redirect:/redirectAssignUser";
	}

//	// after giving all info and press submit button (from
//	// assignUser.html)
//	@PostMapping("/addMultipleUserTogether")
//	public String assignUser(@RequestParam("action") String addUsrBtn, @ModelAttribute AssignUser ausr) {
//		if ("submit".equals(addUsrBtn)) {
//			aur.save(ausr);
//			return "redirect:/redirectAssignUser";
//		} else {
//			aur.save(ausr);
//			return "redirect:/redirectAssignUser";
//		}
//	}

}
