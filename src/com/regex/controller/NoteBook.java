package com.regex.controller;

import com.regex.vie.View;
import java.util.Scanner;

import static com.regex.controller.RegexS.*;
import static com.regex.vie.Container.*;


public class NoteBook {

    private  View view;
    private  Scanner scanner;
    NoteBook(View view,Scanner scanner)
    {
        this.view = view;
        this.scanner=scanner;

    }
    private String name;

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    private String login;
    public void inputNote()
    {
        ControlInput controlInput=new ControlInput(view,scanner);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_NAME_UKR : REGEX_NAME_LAT;
        this.name=controlInput.inputStrinWithScanner(FIRST_NAME,str);

        this.login=controlInput.inputStrinWithScanner(LOGIN_DATA,REGEX_LOGIN);


    }

    public void inputLogin(){
        ControlInput controller =
                new ControlInput(view,scanner);
        this.login =
                controller.inputStrinWithScanner
                        (LOGIN_DATA, REGEX_LOGIN);
    }

}
