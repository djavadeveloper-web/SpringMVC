package com.jwt.spring.mvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping(value="/admissionform.html",method = RequestMethod.GET)
	public ModelAndView getAmissionForm() {
		
		ModelAndView model=new  ModelAndView("AdmissionForm");
		
		return model;
	}


	@RequestMapping(value="/admissionSubmit.html", method = RequestMethod.POST)
	public ModelAndView admissionSubmit(@RequestParam Map<String,String> repar) {
		
		String firstName=repar.get("firstname");
		String lastName=repar.get("lastname");
		ModelAndView model= new ModelAndView("SuccessPage");
		model.addObject("msg","Please Welcome "+ firstName +"  "+ lastName);
		
		return model;
	}

}
