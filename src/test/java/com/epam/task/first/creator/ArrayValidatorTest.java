package com.epam.task.first.creator;

import org.junit.Assert;
import org.junit.Test;

public class ArrayValidatorTest {

    private static final String validLine = "1,2,3";
    private static final String invalidLine = "1h,2,3";

    @Test
    public void testValidate(){

        ArrayValidator validator = new ArrayValidator();

        boolean isValid = validator.validate(validLine);

        Assert.assertTrue(isValid);

    }

    @Test
    public void testInvalidLine(){

        ArrayValidator validator = new ArrayValidator();

        boolean isInvalid = validator.validate(invalidLine);

        Assert.assertFalse(isInvalid);
    }



}
