package com.mahakuji.oops.innerClasses;

import com.mahakuji.oops.innerClasses.InnerClasses.Test;

public class InnerClasses {

    static class Test{
        String name;
        static int objects = 0;

        Test(String name) {
            this.name = name;
            objects += 1;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Test test = new Test("Mahakuji");
        System.out.println(test.name);
    }
}
