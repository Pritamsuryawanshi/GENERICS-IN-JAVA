package com.Generics;

import com.Generics.FindMaximumNumber.FindMaximumNumber;
import org.junit.Assert;
import org.junit.Test;

public class MaxValueTestUsingGenerics {

    @Test
    public void givenThreeIntegers_WhenMaximunValueAtFirstPosition_ReturnSameNumber() {
        FindMaximumNumber findMax = new FindMaximumNumber();
        Integer maxNumber = findMax.maxIntegerValue();
        Assert.assertEquals((Integer) 3, maxNumber);
    }
}