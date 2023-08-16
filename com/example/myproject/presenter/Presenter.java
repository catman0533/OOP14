package com.example.myproject.presenter;

import com.example.myproject.model.Service;
import com.example.myproject.view.View;


public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void addStudent(String name, int age) {
        service.addPerson(name, age);
        //какой-то ответ
        getStudentsListInfo();
    }

    public void getStudentsListInfo() {
        String info = service.getPersonsInfo();
        view.printAnswer(info);
    }

    public void sortByAge() {
        service.sortByAge();
        getStudentsListInfo();
    }

    public void sortByName() {
        service.sortByName();
        getStudentsListInfo();
    }
}
