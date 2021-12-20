package com.regex;
import com.regex.controller.Controller;
import com.regex.model.Model;
import com.regex.vie.View;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller(new Model(),new View());
        controller.enterNameAndNickName();
    }
}
