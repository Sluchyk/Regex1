package com.regex.model.entity;

public class NotUniqueLoginExeption extends  Exception{
    private String loginData;

    public String getLoginData() {
        return loginData;
    }

    public NotUniqueLoginExeption(String message, String loginData) {
        super(message);
        this.loginData = loginData;
    }

}
