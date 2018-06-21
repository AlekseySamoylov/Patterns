package com.alekseysamoylov.patterns.template.method;

public abstract class VacationPolicy {

    public void accureVacation() {
        calculateBaseVacationHours();
        alterForLegalMinimums();
        applyToPayroll();
    }

    private void applyToPayroll() {
        // do something
    }

    protected abstract void alterForLegalMinimums();

    private void calculateBaseVacationHours() {
        // do something
    }
}
