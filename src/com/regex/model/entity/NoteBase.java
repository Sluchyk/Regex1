package com.regex.model.entity;

public enum NoteBase {
    FIRST("Max","maxS2910"),SECOND("John","649NewZe"),THIRD("Тарас","тарас1234");
    private  String name;
    private  String login;
    NoteBase(String name, String login)
    {
        this.name = name;
        this.login = login;
    }

    public static boolean CheckLogin(String login)
    {
        boolean result=false;
        for(NoteBase note:NoteBase.values())
        {if(note.getLogin().equals(login))
        {
            result=true;
        }

        }
        return  result;
    }
    public String getName() {
        return name;
    }
    public String getLogin() {
        return login;
    }

}
