package com.tutorial.validator;


import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.tutorial.model.User;


@Component
public class UserValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return User.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"name", "field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"firstName", "field.required", "First name is required"); 
		FieldError field = errors.getFieldError();
		System.out.println(field);
		User u = (User) target;
		if (u.getAge()<0){
			errors.rejectValue("age","negativevalue");
		}
		if (u.getName()==""){
			errors.rejectValue("name", "le nom ne peut être vide");
		}
		
	}

}
