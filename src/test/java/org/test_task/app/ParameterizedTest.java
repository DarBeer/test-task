package org.test_task.app;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.test_task.app.implementers.LineToWordConvertor;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class ParameterizedTest {
    private String actual;
    private String expected;

    public ParameterizedTest(String actual, String expected) {
        this.expected = expected;
        this.actual = actual;
    }

    @Parameterized.Parameters(name = "{index}:Преобразование {0} в пропись:  {1}")
    public static Iterable<Object[]> dataForTest() {
        return Arrays.asList(new Object[][] {
                {"1", "один"},
                {"01", "один"},
                {"001", "один"},
                {"11", "одиннадцать"},
                {"011", "одиннадцать"},
                {"110", "сто десять"},
                {"1111", "одна тысяча сто одиннадцать"},
                {"001111", "одна тысяча сто одиннадцать"},
                {"01111", "одна тысяча сто одиннадцать"},
                {"011111", "одиннадцать тысяч сто одиннадцать"},
                {"11111", "одиннадцать тысяч сто одиннадцать"},
                {"3111", "три тысячи сто одиннадцать"},
        });
    }

    @Test
    public void paramTest() {
        Assertions.assertEquals(expected, LineToWordConvertor.Convert(actual));
    }
}
