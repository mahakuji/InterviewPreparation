package com.mahakuji.oops.abstraction;

public class Developer extends Employee {
    int age;
    String name;
    public static final String company = "Master Card";
    private static int count = 0;

    Developer(){
        this("Snehal", 50);
    }

    Developer(String name, int age) {
        this.name = name;
        this.age = age;

        count++;
    }

    @Override
    public final double calLeaves(){
        return 0.0D;
    }

    @Override
    public void greet(String companyName){
        super.greet(companyName);
        System.out.println(this.age);
        System.out.println("Dev say Hello from " + companyName);
    }

    public static int getCount(){
        return count;
    }

    @Override
    public String toString(){
        return ("Name is: " + name + " and age is " + age);
    }

}
