package com.tutorial.validateur;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.tutorial.model.User;

@Component
public class ValidateurUser implements Validator {

	private static final String EMAIL_PATTERN = "[a-z]+@[a-z]{2,6}";
	private static final String NULL_ERROR = "field cant be null";
	private static final String AGE_ERROR = "Age must be between 1 and 100";
	private static final String EMAIL_ERROR = "email must be like this : aaa@aa";
	private static final String NAME_ERROR = "field cant contains more than 20 characters";

	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	public void validate(Object obj, Errors errors) {
		User user = (User) obj;
		validateName(user, errors);
		validateFirstName(user, errors);
		validateEmail(user, errors);
		validateAge(user, errors);
	}

	public void validateName(User user, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name",
				"field.required", NULL_ERROR);
		if (user.getName().length() > 20) {
			errors.rejectValue("name", "field.required", NAME_ERROR);
		}
	}

	public void validateFirstName(User user, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName",
				"field.required", NULL_ERROR);
		if (user.getFirstName().length() > 20) {
			errors.rejectValue("firstName", "field.required", NAME_ERROR);
		}
	}

	public void validateEmail(User user, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email",
				"field.required", NULL_ERROR);
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		Matcher matcher = pattern.matcher(user.getEmail());

		if (!matcher.matches()) {
			errors.rejectValue("email", "character missed", EMAIL_ERROR);
			System.out.println("@ missed in email");
		}
	}

	public void validateAge(User user, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "age",
				"field.required", NULL_ERROR);
		if (user.getAge() < 0 || user.getAge() > 100) {
			errors.rejectValue("age", "age error", AGE_ERROR);
		}
	}
}