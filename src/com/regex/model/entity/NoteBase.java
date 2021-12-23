package com.regex.model.entity;

public enum NoteBase {
    FIRST("Max","maxS2910"),SECOND("John","649NewZe"),THIRD("Тарас","тарас1234");
    private  String nameFirst;
    private  String loginUnique;
    NoteBase(String name, String loginUnique)
    {
        this.nameFirst = name;
        this.loginUnique = loginUnique;
    }

    public static boolean checkLogin(String login)
    {
        for(NoteBase note:NoteBase.values())
        {
            if(note.getLoginUnique().equals(login))return true;
        }
        return false;
    }
    public String getNameFirst() {
        return nameFirst;
    }
    public String getLoginUnique() {
        return loginUnique;
    }

}
