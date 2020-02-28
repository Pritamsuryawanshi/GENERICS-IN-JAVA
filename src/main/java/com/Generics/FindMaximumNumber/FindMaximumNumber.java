package com.Generics.FindMaximumNumber;

public class FindMaximumNumber {

    //Function to find maximum integer value
    public <E extends Comparable<E>> E maxGenericValue(E a, E b, E c) {
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
