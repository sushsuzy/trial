package org.cap.controller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CodeConstraintValidator implements ConstraintValidator<CustomAnnotation, String> {
    private String idPrefix;
	@Override
	public void initialize(CustomAnnotation constraintAnnotation) {
		idPrefix=constraintAnnotation.value();
		
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		boolean result;
		if(value!=null)
			result=value.startsWith(idPrefix);
		else {
			result=true;
		}
		return result;
	}

}
