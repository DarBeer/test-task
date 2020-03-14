package org.test_task.app.implementers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.test_task.app.enums.Form;
import org.test_task.app.models.Digit;

import java.util.ArrayList;
import java.util.List;

class FormAnalyzerTest {

    @Test
    void analyze() {
        List<Digit> expected = new ArrayList<>();
        expected.add(FormAnalyzer.Analyze(new Digit("1", 1)));
        expected.add(FormAnalyzer.Analyze(new Digit("2", 1)));
        expected.add(FormAnalyzer.Analyze(new Digit("5", 0)));

        List<Digit> actual = new ArrayList<>();
        actual.add(new Digit("1", 1, Form.PLURAL));
        actual.add(new Digit("2", 1, Form.SINGLE));
        actual.add(new Digit("5", 0, Form.SINGLE));

        Assertions.assertEquals(expected, actual);
    }
}