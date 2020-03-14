package org.test_task.app.implementers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.test_task.app.enums.Gender;
import org.test_task.app.models.Digit;
import org.test_task.app.models.NamedOrder;
import org.test_task.app.models.Triple;

import java.util.ArrayList;
import java.util.List;

class GenderAnalyzerTest {

    @Test
    void analyze() {
        List<Digit> digits = new ArrayList<>();
        List<Triple> expected = new ArrayList<>();
        List<Triple> actual = new ArrayList<>();

        digits.add(new Digit("1", 0));
        digits.add(new Digit("1", 1, Gender.FEMININE));
        digits.add(new Digit("1", 2));
        actual.add(new Triple(digits, new NamedOrder(1, Gender.FEMININE)));
        digits.clear();
        digits.add(new Digit("1", 0));
        digits.add(new Digit("1", 1));
        digits.add(new Digit("1", 2));
        expected.add(GenderAnalyzer.Analyze(new Triple(digits, new NamedOrder(1))));
        digits.clear();
        digits.add(new Digit("1", 0));
        digits.add(new Digit("4", 1));
        digits.add(new Digit("3", 2));
        actual.add(new Triple(digits, new NamedOrder(2)));
        expected.add(GenderAnalyzer.Analyze(new Triple(digits, new NamedOrder(2))));

        Assertions.assertEquals(expected, actual);
    }
}