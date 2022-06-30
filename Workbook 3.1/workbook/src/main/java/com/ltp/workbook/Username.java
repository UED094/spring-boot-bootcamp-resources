package com.ltp.workbook;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UsernameValidator.class)
public @interface Username {
    // default message if constraint is violated
    String message() default "INVALID USERNAME";

    // boilerplate parameters.
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
