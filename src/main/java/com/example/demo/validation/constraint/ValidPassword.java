package com.example.demo.validation.constraint;

import com.example.demo.validation.validator.ValidPasswordValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Constraint(validatedBy = ValidPasswordValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPassword {

    String message() default "Invalid password! The password should have 8 up to 32 characters at least one uppercase character, one lowercase character, one digit, one special symbol and no whitespaces!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
