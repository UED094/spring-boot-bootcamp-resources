package com.ltp.workbook;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UsernameValidator implements ConstraintValidator<Username, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        Pattern pattern = Pattern.compile("[^a-z0-9 ]");
        Matcher matcher = pattern.matcher(value);
        boolean badCharacters = matcher.find();

        if (badCharacters) {
            return false;
        } else {
            return true;
        }
    }

}
