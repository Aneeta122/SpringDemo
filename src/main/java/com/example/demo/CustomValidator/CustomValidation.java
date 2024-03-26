package com.example.demo.CustomValidator;



import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.example.demo.model.Employee;

import java.lang.annotation.ElementType;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CustomValidator.class)
public @interface CustomValidation {
    String message() default "Custom validation error message";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}