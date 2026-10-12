package com.mahakuji.oops.encapsulation;

public class Examination {
    private int mathematicsMarks;

    public void setMathematicsMarks(Object object){
        if (object instanceof Teacher){
            mathematicsMarks = 98;
        }else {
            System.out.println("Not authorized");
        }
    }

    public int getMathematicsMarks() {
        return mathematicsMarks;
    }
}
