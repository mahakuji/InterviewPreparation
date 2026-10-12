package com.mahakuji.oops.udemy.practice1;

public class Person {
    // write code here
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public Boolean isTeen() {
        int age = getAge();
        return age > 12 && age < 20;
    }

    public String getFullName() {
        String fname = getFirstName();
        String lname = getLastName();

        if (fname.isEmpty()) {
            return lname;
        }

        if (lname.isEmpty()) {
            return fname;
        }

        return fname + " " + lname;

    }

}
