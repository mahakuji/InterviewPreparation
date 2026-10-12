package com.mahakuji.oops.encapsulation;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student();

        Examination examination = new Examination();
        examination.setMathematicsMarks(teacher);
        System.out.println(examination.getMathematicsMarks());
    }
}
