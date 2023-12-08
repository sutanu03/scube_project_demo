package com.sutanu.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sutanu.main.model.Quotation;

@Repository
public interface QuotationRepo extends JpaRepository<Quotation, String>{

	
//	4. Populate a Drop Down With a List 
//	Now let’s see how to populate a Drop Down with a list in Thymeleaf. To do so, we’ll create a String list in a controller, and display it in a view.
//
//	First, we’ll create a controller with a method that initializes a String list. Then we’ll use Model attributes to hold our list for rendering inside the view:
//
//	@RequestMapping(value = "/populateDropDownList", method = RequestMethod.GET) 
//	public String populateList(Model model) {
//	    List<String> options = new ArrayList<String>();
//	    options.add("option 1");
//	    options.add("option 2");
//	    options.add("option 3");
//	    model.addAttribute("options", options);
//	    return "dropDownList/dropDownList.html";
//	}
//	Copy
//	Finally, we can refer to our list Model attribute and loop over it to display each list element as an option of the drop-down:
//
//	<select class="form-control" id="dropDownList">
//	    <option value="0">select option</option>
//	    <option th:each="option : ${options}" th:value="${option}" th:text="${option}"></option>
//	</select>
	
}
