package com.jwt.spring.mvc.controller;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	@InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields(new String [] {"lastname"});
        dataBinder.registerCustomEditor(String.class,"firstname",new StudentNameEditor());
        
    }

	@RequestMapping(value="/admissionform.html",method = RequestMethod.GET)
	public ModelAndView getAmissionForm() throws Exception{
		
		String exceptionOccured="NULL_POINTER";
		
		 if(exceptionOccured.equalsIgnoreCase("NULL_POINTER"))
		 {
			 throw new NullPointerException("Null Pointer Exception !!");
		
		 }
		
		ModelAndView  model = new  ModelAndView("AdmissionForm");
		
		return model;
	}
	
	@ModelAttribute
	public void getCommonMessage(Model model) {
		
		model.addAttribute("message", "Spring MVC Success Page !");

		
		
	}


	@RequestMapping(value="/admissionSubmit.html", method = RequestMethod.POST)
	public ModelAndView admissionSubmit(@ModelAttribute ("student") Student  student) {
		
		ModelAndView model= new ModelAndView("SuccessPage");
		
		
		
		return model;
	}
	
	@ResponseBody
	@RequestMapping(value="/students", method = RequestMethod.GET)
	public ModelAndView getStudents(){
		
		
		ArrayList<Student>  studentlist= new ArrayList<Student>();
		
		Student  stud1=new Student("Deepak","Gupta");
		Student  stud2=new Student("Digvijay","Gupta");
		Student  stud3=new Student("Abhishek","Gupta");
		
		studentlist.add(stud1);
		studentlist.add(stud2);
		studentlist.add(stud3);
		ModelAndView model= new ModelAndView("StudentsPage");
		model.addObject("studentlist", studentlist);
		
		
		return model;
		
		
	}
	
	
	
}
