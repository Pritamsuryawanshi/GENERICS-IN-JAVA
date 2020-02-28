package com.Generics.FindMaximumNumber;

public class FindMaximumNumber {

    //Function to find maximum integer
    public Integer maxIntegerValue(Integer a, Integer b, Integer c) {
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0){
            return a;
        }
        else if (b.compareTo(c) > 0){
            return b;
        }
        else
            return c;
    }

    //Function to find maximum integer
    public Float maxFloatValue(Float a, Float b, Float c) {
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
