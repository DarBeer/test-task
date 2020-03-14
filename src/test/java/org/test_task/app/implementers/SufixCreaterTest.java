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

class SufixCreaterTest {

    @Test
    void addSufix() {
        List<Digit> digits = new ArrayList<>();
        digits.add(new DigitBuilder("1", 0, Gender.MASCULINE).build());
        digits.add(new DigitBuilder("3", 1, Gender.MASCULINE).build());
        digits.add(new DigitBuilder("1", 2, Gender.FEMININE).build());

        List<Triple> expected = new ArrayList<>();
        expected.add(EndingCreater.AddEnding(new TripleBuilder(digits, new NamedOrderBuilder(1, Gender.FEMININE, "", Gender.FEMININE).build()).build()));
        expected.add(EndingCreater.AddEnding(new TripleBuilder(digits, new NamedOrderBuilder(0, Gender.MASCULINE, "", Gender.MASCULINE).build()).build()));
        expected.add(EndingCreater.AddEnding(new TripleBuilder(digits, new NamedOrderBuilder(1, Gender.MASCULINE, "", Gender.MASCULINE).build()).build()));

        List<Triple> actual = new ArrayList<>();
        actual.add(new TripleBuilder(digits, new NamedOrderBuilder(1, Gender.FEMININE, "а", Gender.FEMININE).build()).build());
        actual.add(new TripleBuilder(digits, new NamedOrderBuilder(0, Gender.MASCULINE, "", Gender.MASCULINE).build()).build());
        actual.add(new TripleBuilder(digits, new NamedOrderBuilder(1, Gender.MASCULINE, "", Gender.MASCULINE).build()).build());

        Assertions.assertEquals(expected, actual);
    }
}