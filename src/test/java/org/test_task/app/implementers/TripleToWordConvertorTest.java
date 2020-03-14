package org.test_task.app.implementers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.test_task.app.builders.DigitBuilder;
import org.test_task.app.builders.NamedOrderBuilder;
import org.test_task.app.builders.TripleBuilder;
import org.test_task.app.enums.Form;
import org.test_task.app.enums.Gender;
import org.test_task.app.models.Digit;
import org.test_task.app.models.Triple;

import java.util.ArrayList;
import java.util.List;

class TripleToWordConvertorTest {

    @Test
    void digitToString() {
        List<Digit> digits = new ArrayList<>();
        List<Triple> expected = new ArrayList<>();
        List<Triple> actual = new ArrayList<>();

        digits.add(new DigitBuilder("1", 0).build());
        digits.add(new DigitBuilder("1", 1, Form.PLURAL).build());
        digits.add(new DigitBuilder("1", 2).build());

        expected.add(TripleToWordConvertor.DigitToString(new TripleBuilder(digits, new NamedOrderBuilder().build()).build()));
        Triple triple = new TripleBuilder(digits, new NamedOrderBuilder().build()).build();
        triple.setWordString("сто одиннадцать ");
        actual.add(triple);

        digits.clear();
        digits.add(new DigitBuilder("1", 0, Gender.MASCULINE).build());
        digits.add(new DigitBuilder("2", 1, Form.SINGLE).build());
        digits.add(new DigitBuilder("1", 2, Gender.MASCULINE).build());
        expected.add(TripleToWordConvertor.DigitToString(new TripleBuilder(digits, new NamedOrderBuilder().build()).build()));
        triple = new TripleBuilder(digits, new NamedOrderBuilder().build()).build();
        triple.setWordString("сто двадцать один ");
        actual.add(triple);

        digits.clear();
        digits.add(new DigitBuilder("1", 0, Gender.MASCULINE, Form.SINGLE).build());
        digits.add(new DigitBuilder("2", 1, Gender.MASCULINE, Form.SINGLE).build());
        digits.add(new DigitBuilder("1", 2, Gender.FEMININE, Form.SINGLE).build());
        expected.add(TripleToWordConvertor.DigitToString(new TripleBuilder(digits, new NamedOrderBuilder().build()).build()));
        triple = new TripleBuilder(digits, new NamedOrderBuilder().build()).build();
        triple.setWordString("сто двадцать одна ");
        actual.add(triple);

        Assertions.assertEquals(expected, actual);
    }
}