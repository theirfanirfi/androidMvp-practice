package com.irfanullah.practicingmvp;

public class User {

    private String EMAIL;
    private String NAME;

    public User(String EMAIL, String NAME) {
        this.EMAIL = EMAIL;
        this.NAME = NAME;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }
}
