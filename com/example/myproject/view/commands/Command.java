// package com.example.myproject.view.commands;

// import com.example.myproject.view.ConsoleUI;
public abstract class Command {
    String description;
    ConsoleUI consoleUI;

    public Command(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
    }

    public String getDescription() {
        return description;
    }

    public abstract void execute();
}