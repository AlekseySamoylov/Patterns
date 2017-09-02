package com.alekseysamoylov.patterns.templatemethod;


public abstract class Engineering {

    public void papers() {
        math();
        softSkills();
        specialPaper();
    }

    private void math() {
        System.out.println("Mathematics");
    }

    private void softSkills() {
        System.out.println("Soft skills");
    }

    abstract void specialPaper();
}
