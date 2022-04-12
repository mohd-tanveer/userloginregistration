package com.learning.userloginregistration.registration;

import org.springframework.context.annotation.Configuration;

import java.util.function.Predicate;

@Configuration
public class EmailValidator implements Predicate<String> {
    /**
     * Evaluates this predicate on the given argument.
     *
     * @param s the input argument
     * @return {@code true} if the input argument matches the predicate,
     * otherwise {@code false}
     */
    @Override
    public boolean test(String s) {
        //TODO: validate regex
        return true;
    }
}
