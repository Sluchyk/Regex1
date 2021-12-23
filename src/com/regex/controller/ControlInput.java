package com.regex.controller;

import com.regex.vie.View;

import java.util.Scanner;

public class ControlInput {
    private  View view;
    private  Scanner scanner;
    ControlInput(View view, Scanner scanner)
    {
        this.view = view;
        this.scanner = scanner;
    }
     String inputStrinWithScanner(String message, String regex)
    {String res;
        view.printStringInput(message);
        while (!((scanner.hasNext())&&(res = scanner.next()).matches(regex)))
        {

            view.printWrongStringInput(message);
        }
        return  res;
    }

}
