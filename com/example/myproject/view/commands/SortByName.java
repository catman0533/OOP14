// package com.example.myproject.view.commands;
// import com.example.myproject.view.ConsoleUI;

public class SortByName extends Command {
    public SortByName(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Отсортировать список по имени";
    }

    public void execute(){
        consoleUI.sortByName();
    }
}