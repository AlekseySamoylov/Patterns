package com.alekseysamoylov.patterns.strategy;

public class User {
    private Long id;
    private AuthenticationLoggable authenticationLogger;

    public Long getId() {
        return id;
    }

    void setId(Long id) {
        this.id = id;
    }

    AuthenticationLoggable getAuthenticationLogger() {
        return authenticationLogger;
    }

    void setAuthenticationLogger(AuthenticationLoggable authenticationLogger) {
        this.authenticationLogger = authenticationLogger;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return id != null ? id.equals(user.id) : user.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                '}';
    }
}
