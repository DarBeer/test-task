package org.test_task.app.implementers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LineToWordConvertorTest {

    @Test
    void convert() {
        String actual = "сто двадцать один миллиард сто двадцать три миллиона сто двадцать одна тысяча сто тридцать один";
        String expected = LineToWordConvertor.Convert("121123121131");

        Assertions.assertEquals(expected, actual);
    }
}