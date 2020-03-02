package com.Generics;

import com.Generics.FindMaximumNumber.FindMaximumNumber;
import org.junit.Assert;
import org.junit.Test;

public class MaxValueTestUsingGenerics {

    //UC 1.1
    @Test
    public void givenThreeIntegers_WhenMaximumValueAtFirstPosition_ReturnSameNumber() {
        FindMaximumNumber findMax = new FindMaximumNumber(3, 2, 1);
        Comparable maxNumber = findMax.maxGenericValue();
        Assert.assertEquals( 3, maxNumber);
    }

    //UC 1.2
    @Test
    public void givenThreeIntegers_WhenMaximumValueAtSecondPosition_ReturnSameNumber() {
        FindMaximumNumber findMax = new FindMaximumNumber(2, 3, 1);
        Comparable maxNumber = findMax.maxGenericValue();
        Assert.assertEquals( 3, maxNumber);
    }

    //UC 1.2
    @Test
    public void givenThreeIntegers_WhenMaximumValueAtThirdPosition_ReturnSameNumber() {
        FindMaximumNumber findMax = new FindMaximumNumber(2, 2, 3);
        Comparable maxNumber = findMax.maxGenericValue();
        Assert.assertEquals( 3, maxNumber);
    }

    //UC 2.1
    @Test
    public void givenThreeFloats_WhenMaximumValueAtFirstPosition_ReturnSameNumber() {
        FindMaximumNumber findMax = new FindMaximumNumber(3.0f, 2.0f, 1.0f);
        Comparable maxNumber = findMax.maxGenericValue();
        Assert.assertEquals((Float) 3.0f, maxNumber);
    }

    //UC 2.2
    @Test
    public void givenThreeFloats_WhenMaximumValueAtSecondPosition_ReturnSameNumber() {
        FindMaximumNumber findMax = new FindMaximumNumber(2.0f, 3.0f, 1.0f);
        Comparable maxNumber = findMax.maxGenericValue();
        Assert.assertEquals((Float) 3.0f, maxNumber);
    }

    //UC 2.3
    @Test
    public void givenThreeFloats_WhenMaximumValueAtThirdPosition_ReturnSameNumber() {
        FindMaximumNumber findMax = new FindMaximumNumber(2.0f, 1.0f, 3.0f);
        Comparable maxNumber = findMax.maxGenericValue();
        Assert.assertEquals((Float) 3.0f, maxNumber);
    }

    //UC 3.1
    @Test
    public void givenThreeStrings_WhenMaximumStringAFirstPosition_ReturnSameString() {
        FindMaximumNumber findMax = new FindMaximumNumber("Peach", "Apple", "Banana");
        Comparable maxNumber = findMax.maxGenericValue();
        Assert.assertEquals( "Peach", maxNumber);
    }

    //UC 3.2
    @Test
    public void givenThreeStrings_WhenMaximumStringASecondPosition_ReturnSameString() {
        FindMaximumNumber findMax = new FindMaximumNumber("Apple", "Peach", "Banana");
        Comparable maxNumber = findMax.maxGenericValue();
        Assert.assertEquals( "Peach", maxNumber);
    }

    //UC 3.3
    @Test
    public void givenThreeStrings_WhenMaximumStringAThirdPosition_ReturnSameString() {
        FindMaximumNumber findMax = new FindMaximumNumber("Apple", "Banana", "Peach");
        Comparable maxNumber = findMax.maxGenericValue();
        Assert.assertEquals( "Peach", maxNumber);
    }
}