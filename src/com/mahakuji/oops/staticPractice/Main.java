package com.mahakuji.oops.staticPractice;

public class Main {
    static int objects;

    Main(){
        objects += 1;
    }
    public static void main(String[] args) {
//        Human mahakuji = new Human("Mahakuji", 29, 61000);
//        System.out.println(Human.population);
//
//        Human mangesh = new Human("Mangesh", 30, 200000);
//        System.out.println(Human.population);
//
//        Human vishal = new Human("Vishal", 26, 120000);
//        System.out.println(Human.population);

        someFun();
        System.out.println(objects);
        someFun();
        System.out.println(objects);
        someFun();
        System.out.println(objects);
    }

    static void someFun(){
        Main obj = new Main();
        obj.greetings();
    }

    void greetings(){
        System.out.println("Hello");
    }
}
