package com.regex.controller;

import com.regex.model.entity.NoteBase;
import com.regex.vie.RegexS;
import com.regex.vie.View;

import java.util.Scanner;


public class NoteBook implements RegexS,Container{

    private View view;
    private Scanner scanner;
    NoteBook(View view,Scanner scanner)
    {
        this.view = view;
        this.scanner=scanner;

    }
    private String name;
    private String login;
    public void inputNote()
    {
        ControlInput controlInput=new ControlInput(view,scanner);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_NAME_UKR : REGEX_NAME_LAT;
        this.name=controlInput.inputStrinWithScanner(FIRST_NAME,str);

        this.login=controlInput.inputStrinWithScanner(LOGIN_DATA,REGEX_LOGIN);


    }

}
