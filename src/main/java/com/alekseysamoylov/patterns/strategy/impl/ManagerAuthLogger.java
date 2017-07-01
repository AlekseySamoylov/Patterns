package com.alekseysamoylov.patterns.strategy.impl;

import com.alekseysamoylov.patterns.strategy.AuthenticationLoggable;

public class ManagerAuthLogger implements AuthenticationLoggable {
    @Override
    public void logAuthentication() {
        System.out.println("Log manager auth. Visible for Business Owner and Admin");
    }
}