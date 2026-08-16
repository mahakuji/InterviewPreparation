package com.mahakuji.oops.abstraction;

public class Employee {
    int a = 10;

    public static void someFun(){
        System.out.println("static function in Employee");
    }
    public  double calSal(){
        return 0.0D;
    }
    public double calLeaves(){
        return 0.0D;
    }

    public void greet(String companyName){
        System.out.println("Hello, I am an employee, from " + companyName);
    }
}
