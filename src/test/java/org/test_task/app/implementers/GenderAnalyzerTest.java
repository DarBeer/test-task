package org.test_task.app.implementers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.test_task.app.builders.DigitBuilder;
import org.test_task.app.builders.NamedOrderBuilder;
import org.test_task.app.builders.TripleBuilder;
import org.test_task.app.enums.Gender;
import org.test_task.app.models.Digit;
import org.test_task.app.models.Triple;

import java.util.ArrayList;
import java.util.List;

class GenderAnalyzerTest {

    @Test
    void analyze() {
        List<Digit> digits = new ArrayList<>();
        List<Triple> expected = new ArrayList<>();
        List<Triple> actual = new ArrayList<>();

        digits.add(new DigitBuilder("1", 0).build());
        digits.add(new DigitBuilder("1", 1, Gender.FEMININE).build());
        digits.add(new DigitBuilder("1", 2).build());
        actual.add(new TripleBuilder(digits, new NamedOrderBuilder(0).build()).build());
        digits.clear();
        digits.add(new DigitBuilder("1", 0).build());
        digits.add(new DigitBuilder("1", 1).build());
        digits.add(new DigitBuilder("1", 2).build());
        expected.add(GenderAnalyzer.Analyze(new TripleBuilder(digits, new NamedOrderBuilder(0).build()).build()));
        digits.clear();
        digits.add(new DigitBuilder("1", 0).build());
        digits.add(new DigitBuilder("4", 1).build());
        digits.add(new DigitBuilder("3", 2).build());
        actual.add(new TripleBuilder(digits, new NamedOrderBuilder(2).build()).build());
        expected.add(GenderAnalyzer.Analyze(new TripleBuilder(digits, new NamedOrderBuilder(2).build()).build()));

        Assertions.assertEquals(expected, actual);
    }
}