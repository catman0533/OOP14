// package com.example.myproject.view.commands;
// import com.example.myproject.view.ConsoleUI;

public class GetPersonInfo extends Command {
    public GetPersonInfo(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Получить список студентов";
    }

    public void execute(){
        consoleUI.getPersonListInfo();
    }
}