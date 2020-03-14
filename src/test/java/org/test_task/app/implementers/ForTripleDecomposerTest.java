package org.test_task.app.implementers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.test_task.app.builders.DigitBuilder;
import org.test_task.app.enums.Form;
import org.test_task.app.models.Digit;

import java.util.ArrayList;
import java.util.List;

class ForTripleDecomposerTest {

    @Test
    void decompouse() {
        Digit digit1 = new DigitBuilder("1", 0, Form.SINGLE).build();
        Digit digit2 = new DigitBuilder("2", 1, Form.SINGLE).build();
        Digit digit3 = new DigitBuilder("3", 2, Form.SINGLE).build();

        List<Digit> actual = new ArrayList<>();
        actual.add(digit1);
        actual.add(digit2);
        actual.add(digit3);

        List<Digit> expected = ForTripleDecomposer.Decompouse("123");

        Assertions.assertEquals(expected, actual);
    }
}