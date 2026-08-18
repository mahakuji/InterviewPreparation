package com.mahakuji.oops.innerClasses;

public class InnerClasses {

    class Test{

        String name;

        Test(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return "Name is " + name;
        }
    }

    public static void main(String[] args) {

    }
}
