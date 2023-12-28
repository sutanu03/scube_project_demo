package com.sutanu.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sutanu.main.model.Supplier;
import com.sutanu.main.repository.SupplierRepo;

@Controller
@ControllerAdvice
public class ControllerForSupplier {
/*	
	@Autowired
	SupplierRepo supp;	
	
//	// after giving email id and password and press login (from login.html)
//	@PostMapping("/logSupp")
//	public String loginSupplier(@RequestParam String f_supplier_email_id, String h_supplier_password, Model m)
//	{
//		List<Supplier> s = supp.findEmailAndPass(f_supplier_email_id, h_supplier_password);
//		m.addAttribute("supplier", s);
//		return "profile.html";
//	}
	

	// after giving all info and press registration button (from newSupplier.html)
	@PostMapping("/newSuppEntry")
	public String createSupplier(@ModelAttribute Supplier supplier)
	{
		supp.save(supplier);
		return "suppDetails.html";
		//return "redirect:/home";
	}
	*/
}
