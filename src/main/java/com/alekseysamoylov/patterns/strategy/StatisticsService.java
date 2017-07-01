package com.alekseysamoylov.patterns.strategy;

/**
 * Service for write all statistic data in database.
 */
class StatisticsService {

    /**
     * Writes different data into different tables
     *
     * @param authenticationLoggable implementation {@link AuthenticationLoggable}
     */
    void logAuthentication(AuthenticationLoggable authenticationLoggable) {
        authenticationLoggable.logAuthentication();
    }
}
