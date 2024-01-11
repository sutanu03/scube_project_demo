package com.sutanu.main.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sutanu.main.model.Product;
import com.sutanu.main.model.Quotation;
import com.sutanu.main.model.Supplier;
import com.sutanu.main.model.User;
import com.sutanu.main.repository.ProductRepo;
import com.sutanu.main.repository.QuotationRepo;
import com.sutanu.main.repository.SupplierRepo;
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
			     
			// Check if the quotation number exists
			@PostMapping("/quote/checkQuotationNumber")
			  public Map<String, Boolean> checkQuotationNumber(@RequestBody Map<String, String> requestData) {
			    String a_quotation_number = requestData.get("quotationNumber");
			    Map<String, Boolean> response = new HashMap<>();
			    response.put("exists", qr.existsById(a_quotation_number));
			    return response;
			  }
			
			
			
			/*
			 * 
			 * 
			 * Supplier CRED OPERATION
			 * 
			 * 
			 * */
			
			@Autowired
			private SupplierRepo sr;
			
			//add quotation
				@PostMapping("/supplier/add")
				public String createSupp(@RequestBody Supplier supp)
				{
					sr.save(supp);
					return "Supplier Created";
				}
				
				// read all supplier
				@GetMapping("/supplier/read/all")
				public List<Supplier> readSupplier()
				{
					return sr.findAll();
				}
				
				
				/*
				 * 
				 * 
				 * Product CRED OPERATION
				 * 
				 * 
				 */
				
				@Autowired
				private ProductRepo pr;
				
				//add Product
					@PostMapping("/product/add")
					public String createProd(@RequestBody Product prod)
					{
						pr.save(prod);
						return "Product Created";
					} 
					
					// read all product
					@GetMapping("/product/read/all")
					public List<Product> readProduct()
					{
						return pr.findAll();
					}

}
