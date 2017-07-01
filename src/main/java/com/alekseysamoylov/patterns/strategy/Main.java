package com.alekseysamoylov.patterns.strategy;

import com.alekseysamoylov.patterns.strategy.impl.AdminAuthLogger;
import com.alekseysamoylov.patterns.strategy.impl.ManagerAuthLogger;
import com.alekseysamoylov.patterns.strategy.impl.BusinessOwnerAuthLogger;
import com.alekseysamoylov.patterns.strategy.impl.UserAuthLogger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Strategy pattern usage
 */
public class Main {
    public static void main(String[] args) {
        final StatisticsService statisticsService = new StatisticsService();
        final List<User> users = initUsersForTest();

        users.parallelStream().forEach(user -> statisticsService.logAuthentication(user.getAuthenticationLogger()));
    }

    private static List<User> initUsersForTest() {

        User admin = new User();
        admin.setId(0L);
        admin.setAuthenticationLogger(new AdminAuthLogger());

        User user = new User();
        user.setId(1L);
        user.setAuthenticationLogger(new UserAuthLogger());

        User manager = new User();
        manager.setId(2L);
        manager.setAuthenticationLogger(new ManagerAuthLogger());

        User businessOwner = new User();
        businessOwner.setId(3L);
        businessOwner.setAuthenticationLogger(new BusinessOwnerAuthLogger());


        return Arrays.asList(admin, user, manager, businessOwner);
    }
}
