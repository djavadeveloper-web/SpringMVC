package com.jwt.spring.mvc.controller;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {
	
	
	public void setAsText(String firstName) throws IllegalArgumentException{
		
		if(firstName.contains("Mr.")||firstName.contains("Ms.")) {
			
			setValue(firstName);
			
		}
		
		else
		{
			firstName="Mr."+firstName;
			
			setValue(firstName);
		}
		
		
	}
	
	

}
