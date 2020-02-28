package com.Generics;

import com.Generics.FindMaximumNumber.FindMaximumNumber;
import org.junit.Assert;
import org.junit.Test;

public class MaxValueTestUsingGenerics {
    FindMaximumNumber findMax = new FindMaximumNumber();

    //UC 1.1
    @Test
    public void givenThreeIntegers_WhenMaximumValueAtFirstPosition_ReturnSameNumber() {
        Integer maxNumber = findMax.maxIntegerValue(3, 2, 1);
        Assert.assertEquals((Integer) 3, maxNumber);
    }

    //UC 1.2
    @Test
    public void givenThreeIntegers_WhenMaximumValueAtSecondPosition_ReturnSameNumber() {
        Integer maxNumber = findMax.maxIntegerValue(2, 3, 1);
        Assert.assertEquals((Integer) 3, maxNumber);
    }

    //UC 1.2
    @Test
    public void givenThreeIntegers_WhenMaximumValueAtThirdPosition_ReturnSameNumber() {
        Integer maxNumber = findMax.maxIntegerValue(2, 2, 3);
        Assert.assertEquals((Integer) 3, maxNumber);
    }

    //UC 2.1
    @Test
    public void givenThreeFloats_WhenMaximumValueAtFirstPosition_ReturnSameNumber() {
        Float maxNumber = findMax.maxFloatValue(3.0f, 2.0f, 1.0f);
        Assert.assertEquals((Float) 3.0f, maxNumber);
    }

    //UC 2.2
    @Test
    public void givenThreeFloats_WhenMaximumValueAtSecondPosition_ReturnSameNumber() {
        Float maxNumber = findMax.maxFloatValue(2.0f, 3.0f, 1.0f);
        Assert.assertEquals((Float) 3.0f, maxNumber);
    }

    //UC 2.3
    @Test
    public void givenThreeFloats_WhenMaximumValueAtThirdPosition_ReturnSameNumber() {
        Float maxNumber = findMax.maxFloatValue(2.0f, 1.0f, 3.0f);
        Assert.assertEquals((Float) 3.0f, maxNumber);
    }
}