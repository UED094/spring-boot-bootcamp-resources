package com.ltp.workbook;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.Validator;

@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AgeValidator.class)
public @interface Age {
    // default message if constraint is violated
    String message() default "INVALID AGE";

    // boilerplate parameters.
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
