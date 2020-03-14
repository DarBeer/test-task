package org.test_task.app.implementers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.test_task.app.builders.DigitBuilder;
import org.test_task.app.builders.NamedOrderBuilder;
import org.test_task.app.builders.TripleBuilder;
import org.test_task.app.enums.Form;
import org.test_task.app.models.Digit;
import org.test_task.app.models.Triple;

import java.util.ArrayList;
import java.util.List;

class BasicDecomposerTest {

    @Test
    void decompose() {
        List<Digit> digits = new ArrayList<>();
        digits.add(new DigitBuilder("7", 0, Form.SINGLE).build());
        digits.add(new DigitBuilder("8", 1, Form.SINGLE).build());
        digits.add(new DigitBuilder("9", 2, Form.SINGLE).build());

        Triple triple1 = new TripleBuilder(digits, new NamedOrderBuilder(0).build()).build();

        List<Digit> digits1 = new ArrayList<>();
        digits1.add(new DigitBuilder("4", 0, Form.SINGLE).build());
        digits1.add(new DigitBuilder("5", 1, Form.SINGLE).build());
        digits1.add(new DigitBuilder("6", 2, Form.SINGLE).build());

        Triple triple2 = new TripleBuilder(digits1, new NamedOrderBuilder(1).build()).build();

        List<Digit> digits2 = new ArrayList<>();
        digits2.add(new DigitBuilder("1", 0, Form.SINGLE).build());
        digits2.add(new DigitBuilder("2", 1, Form.SINGLE).build());
        digits2.add(new DigitBuilder("3", 2, Form.SINGLE).build());
        Triple triple3 = new TripleBuilder(digits2, new NamedOrderBuilder(2).build()).build();

        List<Triple> actual = new ArrayList<>();
        actual.add(triple1);
        actual.add(triple2);
        actual.add(triple3);

        List<Triple> expected = BasicDecomposer.Decompose("123456789");

        Assertions.assertEquals(expected, actual);

        digits.clear();
        digits.add(new DigitBuilder("7", 0, Form.SINGLE).build());
        digits.add(new DigitBuilder("8", 1, Form.SINGLE).build());
        digits.add(new DigitBuilder("9", 2, Form.SINGLE).build());

        triple1 = new TripleBuilder(digits, new NamedOrderBuilder(0).build()).build();

        digits1.clear();
        digits1.add(new DigitBuilder("4", 0, Form.SINGLE).build());
        digits1.add(new DigitBuilder("5", 1, Form.SINGLE).build());
        digits1.add(new DigitBuilder("6", 2, Form.SINGLE).build());

        triple2 = new TripleBuilder(digits1, new NamedOrderBuilder(1).build()).build();

        digits2.clear();
        digits2.add(new DigitBuilder("0", 0, Form.SINGLE).build());
        digits2.add(new DigitBuilder("2", 1, Form.SINGLE).build());
        digits2.add(new DigitBuilder("3", 2, Form.SINGLE).build());
        triple3 = new TripleBuilder(digits2, new NamedOrderBuilder(2).build()).build();

        actual.clear();
        actual.add(triple1);
        actual.add(triple2);
        actual.add(triple3);

        expected = BasicDecomposer.Decompose("23456789");

        Assertions.assertEquals(expected, actual);

        digits.clear();
        digits.add(new DigitBuilder("7", 0, Form.SINGLE).build());
        digits.add(new DigitBuilder("8", 1, Form.SINGLE).build());
        digits.add(new DigitBuilder("9", 2, Form.SINGLE).build());

        triple1 = new TripleBuilder(digits, new NamedOrderBuilder(0).build()).build();

        digits1.clear();
        digits1.add(new DigitBuilder("4", 0, Form.SINGLE).build());
        digits1.add(new DigitBuilder("5", 1, Form.SINGLE).build());
        digits1.add(new DigitBuilder("6", 2, Form.SINGLE).build());

        triple2 = new TripleBuilder(digits1, new NamedOrderBuilder(1).build()).build();

        digits2.clear();
        digits2.add(new DigitBuilder("0", 0, Form.SINGLE).build());
        digits2.add(new DigitBuilder("0", 1, Form.SINGLE).build());
        digits2.add(new DigitBuilder("3", 2, Form.SINGLE).build());
        triple3 = new TripleBuilder(digits2, new NamedOrderBuilder(2).build()).build();

        actual.clear();
        actual.add(triple1);
        actual.add(triple2);
        actual.add(triple3);

        expected = BasicDecomposer.Decompose("3456789");

        Assertions.assertEquals(expected, actual);
    }
}