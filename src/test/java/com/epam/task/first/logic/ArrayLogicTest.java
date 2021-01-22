package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;

public class ArrayLogicTest {

    private ArrayLogic arrayLogic = new ArrayLogic();

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxShouldFindMaxWhenArraySizeIsZeroApplied() {
        arrayLogic.findMax(new Array());
    }

    @Test
    public void testFindMaxShouldFindMaxWhenPositiveNumbersApplied() {

        Array array = new Array(1, 3, 2);

        int actual = arrayLogic.findMax(array);

        Assert.assertEquals(3, actual);
    }

    @Test
    public void testFindMaxShouldFindMaxWhenNegativeNumbersApplied() {

        Array array = new Array(-1, -3, -2);

        int actual = arrayLogic.findMax(array);

        Assert.assertEquals(-1, actual);
    }

    @Test
    public void testFindMaxShouldFindMaxWhenNegativeAndPositiveNumbersApplied() {

        Array array = new Array(-1, 1, -2);

        int actual = arrayLogic.findMax(array);

        Assert.assertEquals(1, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMinShouldFindMinWhenArraySizeIsZeroApplied() {
        arrayLogic.findMax(new Array());
    }

    @Test
    public void testFindMinShouldFindMinWhenPositiveNumbersApplied() {

        Array array = new Array(1, 3, 2);

        int actual = arrayLogic.findMin(array);

        Assert.assertEquals(1, actual);
    }

    @Test
    public void testFindMinShouldFindMinWhenNegativeNumbersApplied() {

        Array array = new Array(-1, -3, -2);

        int actual = arrayLogic.findMin(array);

        Assert.assertEquals(-3, actual);
    }

    @Test
    public void testFindMinShouldFindMinWhenNegativeAndPositiveNumbersApplied() {

        Array array = new Array(-1, 1, -2);

        int actual = arrayLogic.findMin(array);

        Assert.assertEquals(-2, actual);
    }


    @Test
    public void testFindAverageShouldFindAverageWhenPositiveNumbersApplied() {

        Array array = new Array(1, 3, 2);

        int actual = arrayLogic.findAverage(array);

        Assert.assertEquals(2, actual);
    }

    @Test
    public void testFindAverageShouldFindAverageWhenNegativeNumbersApplied() {

        Array array = new Array(-1, -3, -2);

        int actual = arrayLogic.findAverage(array);

        Assert.assertEquals(-2, actual);
    }

    @Test
    public void testFindAverageShouldFindAverageWhenNegativeAndPositiveNumbersApplied() {

        Array array = new Array(-1, 6, -2);

        int actual = arrayLogic.findAverage(array);

        Assert.assertEquals(1, actual);
    }

    @Test
    public void testFindAverageShouldFindAverageWhenNegativeAndPositiveNumbersAndAverageEqualToZeroApplied() {

        Array array = new Array(-1, 1, -2);

        int actual = arrayLogic.findAverage(array);

        Assert.assertEquals(0, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindAverageShouldFindAverageWhenArraySizeIsZeroApplied() {
        arrayLogic.findMax(new Array());
    }

    @Test
    public void testFindAverageShouldFindAverageWhenNegativeAndPositiveNumbersAndAverageNegativeApplied() {

        Array array = new Array(-1, -3, -2);

        int actual = arrayLogic.findAverage(array);

        Assert.assertEquals(-2, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindSumShouldFindSumWhenArraySizeIsZeroApplied() {
        arrayLogic.findMax(new Array());
    }

    @Test
    public void testFindSumShouldFindSumWhenPositiveNumbersApplied() {

        Array array = new Array(1, 3, 2);

        int actual = arrayLogic.findSum(array);

        Assert.assertEquals(6, actual);
    }

    @Test
    public void testFindSumShouldFindSumWhenNegativeNumbersApplied() {

        Array array = new Array(-1, -3, -2);

        int actual = arrayLogic.findSum(array);

        Assert.assertEquals(-6, actual);
    }

    @Test
    public void testFindSumShouldFindSumWhenNegativeAndPositiveNumbersApplied() {

        Array array = new Array(-1, 1, -2);

        int actual = arrayLogic.findSum(array);

        Assert.assertEquals(-2, actual);
    }

    @Test
    public void testFindSumShouldFindSumWhenPositiveAndZeroNumbersApplied() {

        Array array = new Array(0, 3, 2);

        int actual = arrayLogic.findSum(array);

        Assert.assertEquals(5, actual);
    }

    @Test
    public void testFindSumShouldFindSumWhenNegativeAndZeroNumbersApplied() {

        Array array = new Array(0, -1, -2);

        int actual = arrayLogic.findSum(array);

        Assert.assertEquals(-3, actual);
    }

    @Test
    public void testFindSumShouldFindSumWhenNegativeAndPositiveAndZeroNumbersApplied() {

        Array array = new Array(0, 1, -2);

        int actual = arrayLogic.findSum(array);

        Assert.assertEquals(-1, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindCountPositiveElementsShouldFindQuantityPositiveElementsWhenArraySizeIsZeroApplied() {
        arrayLogic.findMax(new Array());
    }

    @Test
    public void testFindCountPositiveElementsShouldFindQuantityPositiveElementsWhenPositiveNumbersApplied() {

        Array array = new Array(1, 3, 2);

        int actual = arrayLogic.findCountPositiveElements(array);

        Assert.assertEquals(3, actual);
    }

    @Test
    public void testFindCountPositiveElementsShouldFindQuantityPositiveElementsWhenNegativeNumbersApplied() {

        Array array = new Array(-1, -3, -2);

        int actual = arrayLogic.findCountPositiveElements(array);

        Assert.assertEquals(0, actual);
    }

    @Test
    public void testFindCountPositiveElementsShouldFindQuantityPositiveElementsWhenNegativeAndPositiveNumbersApplied() {

        Array array = new Array(-1, 3, -2);

        int actual = arrayLogic.findCountPositiveElements(array);

        Assert.assertEquals(1, actual);
    }

    @Test
    public void testFindCountPositiveElementsShouldFindQuantityPositiveElementsWhenNegativeAndPositiveAndZeroNumbersApplied() {

        Array array = new Array(-1, 3, 0);

        int actual = arrayLogic.findCountPositiveElements(array);

        Assert.assertEquals(1, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindCountNegativeElementsShouldFindQuantityPositiveElementsWhenArraySizeIsZeroApplied() {
        arrayLogic.findMax(new Array());
    }

    @Test
    public void testFindCountNegativeElementsShouldFindQuantityPositiveElementsWhenPositiveNumbersApplied() {

        Array array = new Array(1, 3, 2);

        int actual = arrayLogic.findCountNegativeElements(array);

        Assert.assertEquals(0, actual);
    }

    @Test
    public void testFindCountNegativeElementsShouldFindQuantityPositiveElementsWhenNegativeNumbersApplied() {

        Array array = new Array(-1, -3, -2);

        int actual = arrayLogic.findCountNegativeElements(array);

        Assert.assertEquals(3, actual);
    }

    @Test
    public void testFindCountNegativeElementsShouldFindQuantityPositiveElementsWhenNegativeAndPositiveNumbersApplied() {

        Array array = new Array(-1, 3, -2);

        int actual = arrayLogic.findCountNegativeElements(array);

        Assert.assertEquals(2, actual);
    }

    @Test
    public void testFindCountNegativeElementsShouldFindQuantityPositiveElementsWhenNegativeAndPositiveAndZeroNumbersApplied() {

        Array array = new Array(-1, 3, 0);

        int actual = arrayLogic.findCountNegativeElements(array);

        Assert.assertEquals(1, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void dividesAnEvenNumberByTwoShouldFindAnEvenNumbersWhenArraySizeIsZeroApplied() {
        arrayLogic.findMax(new Array());
    }

    @Test
    public void dividesAnEvenNumberByTwoShouldFindAnEvenNumbersWhenPositiveNumberAndDividesByTwoApplied() {
        Array array = new Array(6, 3, 3);

        int[] actual = arrayLogic.dividesAnEvenNumberByTwo(array);

        Assert.assertArrayEquals(new int[]{3, 3, 3}, actual);
    }

    @Test
    public void dividesAnEvenNumberByTwoShouldFindAnEvenNumbersWhenNegativeNumberAndDividesByTwoApplied() {
        Array array = new Array(-6, -3, -3);

        int[] actual = arrayLogic.dividesAnEvenNumberByTwo(array);

        Assert.assertArrayEquals(new int[]{-3, -3, -3}, actual);
    }

    @Test
    public void dividesAnEvenNumberByTwoShouldFindAnEvenNumbersWhenNegativeAndPositiveNumberAndDividesByTwoApplied() {
        Array array = new Array(-6, 6, -3);

        int[] actual = arrayLogic.dividesAnEvenNumberByTwo(array);

        Assert.assertArrayEquals(new int[]{-3, 3, -3}, actual);
    }

    @Test
    public void dividesAnEvenNumberByTwoShouldFindAnEvenNumbersWhenNegativeAndPositiveAndZeroNumberAndDividesByTwoApplied() {
        Array array = new Array(-6, 6, 0);

        int[] actual = arrayLogic.dividesAnEvenNumberByTwo(array);

        Assert.assertArrayEquals(new int[]{-3, 3, 0}, actual);
    }

    @Test
    public void dividesAnEvenNumberByTwoShouldFindAnEvenNumbersWhenNegativeAndPositiveAndZeroNumberAndNumberDontDividesByTwoApplied() {
        Array array = new Array(5, -5, 3);

        int[] actual = arrayLogic.dividesAnEvenNumberByTwo(array);

        Assert.assertArrayEquals(new int[]{5, -5, 3}, actual);
    }
}
