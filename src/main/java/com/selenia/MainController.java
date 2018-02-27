package com.selenia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.selenia.entities.RegistrationForm;
import com.selenia.repository.RegistrationFormRepo;


@Controller
public class MainController {

	@RequestMapping("/mainPage")
	public String index(){
		return "index.html";
	}
	
	
	@RequestMapping("/registration_save")
	@ResponseBody
	public String ex_rm_save(@RequestParam("fname")String firstname,
			@RequestParam("lname")String lastname,
			@RequestParam("password")String passsword,			
			@RequestParam("cpassword")String repeat_password){
		
		System.out.println("Firstname is--"+firstname);
		System.out.println("lastname is--"+lastname);
		System.out.println("passsword is--"+passsword);
		System.out.println("repeat_password is--"+repeat_password);
		
		//RegistrationForm reg=new RegistrationForm(firstname,lastname,email,passsword,repeat_password,mobile);
		//regrepo.save(reg);
		
		
		return "SAved";
		
	}
	
	@Autowired
	private RegistrationFormRepo regrepo;
}
