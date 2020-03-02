package com.Generics.FindMaximumNumber;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class FindMaximumNumber<E extends Comparable<E>> {
    public E a;
    public E b;
    public E c;
    public E[] optional;

    public FindMaximumNumber(E a, E b, E c, E... optional) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.optional = optional;
    }

    //Function to find maximum integer value
    public <P extends Comparable<P>> E maxGenericValue() {
        return maxGenericValue(a, b, c, optional);
    }

    public <P extends Comparable<P>> E maxGenericValue(E a, E b, E c, E... optional) {
        E maxValue;
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
            maxValue = a;
        } else if (b.compareTo(c) > 0) {
            maxValue = b;
        } else
            maxValue = c;
        if (optional.length != 0) {
            Arrays.sort(optional, Collections.reverseOrder());
            if (optional[0].compareTo(maxValue) > 0)
                maxValue=optional[0];
        }
        return maxValue;
    }
}