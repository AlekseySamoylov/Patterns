package com.alekseysamoylov.patterns.strategy.impl;

import com.alekseysamoylov.patterns.strategy.AuthenticationLoggable;

public class BusinessOwnerAuthLogger implements AuthenticationLoggable {
    @Override
    public void logAuthentication() {
        System.out.println("Hided log Owner auth. Visible for Admin only");
    }
}