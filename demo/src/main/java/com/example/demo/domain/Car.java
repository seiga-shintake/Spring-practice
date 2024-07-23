package com.example.demo.domain;

public class Car {
    private int Speed;
    private String bodyColor;

    public Car(int Speed,String bodyColor){
        this.Speed = Speed;
        this.bodyColor = bodyColor;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

}
