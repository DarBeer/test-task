package org.test_task.app.implementers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.test_task.app.enums.Gender;
import org.test_task.app.models.Digit;
import org.test_task.app.models.NamedOrder;
import org.test_task.app.models.Triple;

import java.util.ArrayList;
import java.util.List;

class SufixCreaterTest {

    @Test
    void addSufix() {
        List<Digit> digits = new ArrayList<>();
        digits.add(new Digit("1", 0, Gender.MASCULINE));
        digits.add(new Digit("3", 1, Gender.MASCULINE));
        digits.add(new Digit("1", 2, Gender.FEMININE));

        List<Triple> expected = new ArrayList<>();
        expected.add(EndingCreater.AddEnding(new Triple(digits, new NamedOrder(1, Gender.FEMININE, "", Gender.FEMININE))));
        expected.add(EndingCreater.AddEnding(new Triple(digits, new NamedOrder(0, Gender.MASCULINE, "", Gender.MASCULINE))));
        expected.add(EndingCreater.AddEnding(new Triple(digits, new NamedOrder(1, Gender.MASCULINE, "", Gender.MASCULINE))));

        List<Triple> actual = new ArrayList<>();
        actual.add(new Triple(digits, new NamedOrder(1, Gender.FEMININE, "а", Gender.FEMININE)));
        actual.add(new Triple(digits, new NamedOrder(0, Gender.MASCULINE, "", Gender.MASCULINE)));
        actual.add(new Triple(digits, new NamedOrder(1, Gender.MASCULINE, "", Gender.MASCULINE)));

        Assertions.assertEquals(expected, actual);
    }
}