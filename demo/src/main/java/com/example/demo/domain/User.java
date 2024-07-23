package com.example.demo.domain;

public class User {
    private String name;
    private String adless;
    private int gender;
    private String pass;
    private String genderString;

    public String getGenderString() {
        return genderString;
    }

    public void setGenderString(String genderString) {
        this.genderString = genderString;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdless() {
        return adless;
    }

    public void setAdless(String adless) {
        this.adless = adless;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String genderChange(int gender) {
        if (gender == 1) {
            return "男性";
        } else {
            return "女性";
        }
    }

}
