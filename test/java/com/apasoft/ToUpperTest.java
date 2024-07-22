package com.apasoft;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ToUpperTest {
    @Test
    public void testConvertToUpper() {
        String input = "hello";
        String expected = "HELLO";
        String output = ToUpper.convertToUpper(input);
        assertEquals(expected, output);
    }
}
