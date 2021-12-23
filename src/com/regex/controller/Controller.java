package com.regex.controller;

import com.regex.model.Model;
import com.regex.model.entity.NotUniqueLoginExeption;
import com.regex.model.entity.NoteBaseLoginUnique;
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
        NoteBaseLoginUnique base =getNoteBook(noteBook);

    }
    private NoteBaseLoginUnique getNoteBook(NoteBook inputNoteBook) {
        NoteBaseLoginUnique note = null;
        while(true) {
            try {
                note = new NoteBaseLoginUnique(inputNoteBook.getName(),
                        inputNoteBook.getLogin());
                break;
            } catch (NotUniqueLoginExeption e) {
                e.printStackTrace();
                System.out.println("Not Unique Login " + e.getLoginData());
                inputNoteBook.inputLogin();
            }
        }
        return note;
    }
}
