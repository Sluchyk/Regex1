package com.regex.controller;

import com.regex.model.Model;
import com.regex.vie.View;

import java.util.Scanner;


public class Controller {
    private Model model;
    private View view;
    public Controller(Model model, View view)
    {
        this.model = model;
        this.view = view;
    }
    public  void enterNameAndNickName()
    {
        Scanner scanner = new Scanner(System.in);
        NoteBook noteBook =new NoteBook(view,scanner);
        noteBook.inputNote();

    }
}
