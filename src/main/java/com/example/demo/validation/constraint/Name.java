package com.example.demo.validation.constraint;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Documented;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;

@NotBlank(message = "Can't be empty!")
@Size(min = 2, max = 20, message = "The length should be between 2 and 20 characters!")
@Pattern(regexp = "^[A-Za-z]*$", message = "Should contain only letters!")
@Documented
@Constraint(validatedBy = {})
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Name {

    String message();

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
