package com.annotation.CustomAnnotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<EmailValidation,String> {
    @Override
    public void initialize(EmailValidation emailValidation){
        ConstraintValidator.super.initialize(emailValidation);
    }
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext)
    {
        return s!=null && s.matches("^[a-zA-Z0-9+_.-]+@gmail.com");
    }
}
