package org.test_task.app.implementers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.test_task.app.enums.Form;
import org.test_task.app.enums.Gender;
import org.test_task.app.models.Digit;
import org.test_task.app.models.NamedOrder;
import org.test_task.app.models.Triple;

import java.util.ArrayList;
import java.util.List;

class TripleToWordConvertorTest {

    @Test
    void digitToString() {
        List<Digit> digits = new ArrayList<>();
        List<Triple> expected = new ArrayList<>();
        List<Triple> actual = new ArrayList<>();

        digits.add(new Digit("1", 0));
        digits.add(new Digit("1", 1, Form.PLURAL));
        digits.add(new Digit("1", 2));

        expected.add(TripleToWordConvertor.DigitToString(new Triple(digits, new NamedOrder())));
        Triple triple = new Triple(digits, new NamedOrder());
        triple.setWordString("сто одиннадцать ");
        actual.add(triple);

        digits.clear();
        digits.add(new Digit("1", 0, Gender.MASCULINE));
        digits.add(new Digit("2", 1, Form.SINGLE));
        digits.add(new Digit("1", 2, Gender.MASCULINE));
        expected.add(TripleToWordConvertor.DigitToString(new Triple(digits, new NamedOrder())));
        triple = new Triple(digits, new NamedOrder());
        triple.setWordString("сто двадцать один ");
        actual.add(triple);

        digits.clear();
        digits.add(new Digit("1", 0, Gender.MASCULINE, Form.SINGLE));
        digits.add(new Digit("2", 1, Gender.MASCULINE, Form.SINGLE));
        digits.add(new Digit("1", 2, Gender.FEMININE, Form.SINGLE));
        expected.add(TripleToWordConvertor.DigitToString(new Triple(digits, new NamedOrder())));
        triple = new Triple(digits, new NamedOrder());
        triple.setWordString("сто двадцать одна ");
        actual.add(triple);

        Assertions.assertEquals(expected, actual);
    }
}