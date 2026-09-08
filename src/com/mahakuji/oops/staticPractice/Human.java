package com.mahakuji.oops.staticPractice;

public class Human {

    String name;
    int age;
    int salary;
    static int population;

    Human(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
        Human.population += 1;
    }
}
