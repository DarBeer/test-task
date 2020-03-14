package org.test_task.app.implementers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.test_task.app.builders.DigitBuilder;
import org.test_task.app.enums.Form;
import org.test_task.app.models.Digit;

import java.util.ArrayList;
import java.util.List;

class FormAnalyzerTest {

    @Test
    void analyze() {
        List<Digit> expected = new ArrayList<>();
        expected.add(FormAnalyzer.Analyze(new DigitBuilder("1", 1).build()));
        expected.add(FormAnalyzer.Analyze(new DigitBuilder("2", 1).build()));
        expected.add(FormAnalyzer.Analyze(new DigitBuilder("5", 0).build()));

        List<Digit> actual = new ArrayList<>();
        actual.add(new DigitBuilder("1", 1, Form.PLURAL).build());
        actual.add(new DigitBuilder("2", 1, Form.SINGLE).build());
        actual.add(new DigitBuilder("5", 0, Form.SINGLE).build());

        Assertions.assertEquals(expected, actual);
    }
}