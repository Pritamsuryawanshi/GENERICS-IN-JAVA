package com.Generics;

import com.Generics.FindMaximumNumber.FindMaximumNumber;
import org.junit.Assert;
import org.junit.Test;

public class MaxValueTestUsingGenerics {

    //UC 1.1
    @Test
    public void givenThreeIntegers_WhenMaximumValueAtFirstPosition_ReturnSameNumber() {
        FindMaximumNumber findMax = new FindMaximumNumber();
        Integer maxNumber = findMax.maxIntegerValue(3, 2, 1);
        Assert.assertEquals((Integer) 3, maxNumber);
    }

    //UC 1.2
    @Test
    public void givenThreeIntegers_WhenMaximumValueAtSecondPosition_ReturnSameNumber() {
        FindMaximumNumber findMax = new FindMaximumNumber();
        Integer maxNumber = findMax.maxIntegerValue(2, 3, 1);
        Assert.assertEquals((Integer) 3, maxNumber);
    }

    //UC 1.2
    @Test
    public void givenThreeIntegers_WhenMaximumValueAtThirdPosition_ReturnSameNumber() {
        FindMaximumNumber findMax = new FindMaximumNumber();
        Integer maxNumber = findMax.maxIntegerValue(2, 2, 3);
        Assert.assertEquals((Integer) 3, maxNumber);
    }
}