package com.company;

public class Employee {
    private String name;
    private int salary;

    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    void who(){
        System.out.println("Ссылочная переменная ФИО: " + name + "\n" + "Примитивная переменная Зарплата: " + salary);
    }

    public int getSalary() {
        return salary;
    }
}
