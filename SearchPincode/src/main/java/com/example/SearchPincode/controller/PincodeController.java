package com.example.SearchPincode.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.SearchPincode.domain.Pincode;
import com.example.SearchPincode.service.PincodeService;



@Controller("PincodeController")
public class PincodeController {
	 
	
	@Autowired
	private PincodeService service;
	
	@GetMapping("/")
	public String add(Model model) {
		@SuppressWarnings("unused")
		java.util.List<Pincode> listpincode = service.listAll();
		model.addAttribute("pincode", new Pincode());
		return "index";
	}

	@PostMapping("/search")
	public String doSearchPin(@ModelAttribute("pincodeSearchFormData") Pincode pincode, Model model) {
	    Pincode pin = service.get(pincode.getPin());
		model.addAttribute("pincode", pin);
		return "index";
	}
}
