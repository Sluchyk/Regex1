package com.regex.model.entity;

public class NoteBaseLoginUnique {
    private String name;
    private String login;

    public NoteBaseLoginUnique(String name, String login)
            throws NotUniqueLoginExeption {
        if (NoteBase.checkLogin(login)){
            throw new NotUniqueLoginExeption("Not Unique Login,try something else ",
                    login);
        }
        this.name = name;
        this.login = login;
    }

    public String getFirstName() {
        return name;
    }
    public void setFirstName(String name) {
        this.name = name;
    }
    public String getLoginData() {
        return login;
    }
    public void setLoginData(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "name=" + name + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
