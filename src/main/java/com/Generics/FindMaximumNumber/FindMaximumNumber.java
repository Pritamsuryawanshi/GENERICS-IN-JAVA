package com.Generics.FindMaximumNumber;

public class FindMaximumNumber {
    Integer a = 3;
    Integer b = 2;
    Integer c = 1;

    public Integer maxIntegerValue() {
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0){
            return a;
        }
        else if (b.compareTo(c) > 0){
            return b;
        }
        else
            return c;
    }
}
