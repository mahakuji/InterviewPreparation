package com.mahakuji.oops.singleton;

public class SingletonCall {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance(23);
        Singleton obj2 = Singleton.getInstance(34);
        /*obj2 is redundant because once the object is created
          it cannot be created again with new values*/

        System.out.println(obj1.age);//age = 23
        System.out.println(obj2.age);//same output, age = 23
    }
}
