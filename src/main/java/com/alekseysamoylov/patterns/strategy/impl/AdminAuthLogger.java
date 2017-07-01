package com.alekseysamoylov.patterns.strategy.impl;

import com.alekseysamoylov.patterns.strategy.AuthenticationLoggable;

public class AdminAuthLogger implements AuthenticationLoggable {
    @Override
    public void logAuthentication() {
        System.out.println("Admin log user auth. Visible for Admin only");
    }
}
