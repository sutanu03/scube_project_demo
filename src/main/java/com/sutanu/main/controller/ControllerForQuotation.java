package com.sutanu.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sutanu.main.model.Quotation;
import com.sutanu.main.repository.QuotationRepo;

@Controller
@ControllerAdvice
public class ControllerForQuotation {
/*	
	@Autowired
	QuotationRepo qr;
	
	@PostMapping("/quotationEntry")
	public String quotationEntry(@ModelAttribute Quotation q) {
		qr.save(q);
		return "quotation.html";
	}
/*	
	@RequestMapping(value = "/populateDropDownList", method = RequestMethod.GET) 
	public String populateList(Model model) {
	    List<String> options = new ArrayList<String>();
	    options.add("option 1");
	    options.add("option 2");
	    options.add("option 3");
	    model.addAttribute("options", options);
	    return "dropDownList/dropDownList.html";
	}
*/
}
