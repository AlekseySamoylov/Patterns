package com.alekseysamoylov.patterns.strategy.impl;

import com.alekseysamoylov.patterns.strategy.AuthenticationLoggable;

public class UserAuthLogger implements AuthenticationLoggable {
    @Override
    public void logAuthentication() {
        System.out.println("Simple log user auth. Visible for Manager, Business Owner and Admin");
    }
}
