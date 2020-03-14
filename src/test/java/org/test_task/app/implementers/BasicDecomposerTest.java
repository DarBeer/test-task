package org.test_task.app.implementers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.test_task.app.enums.Form;
import org.test_task.app.models.Digit;
import org.test_task.app.models.NamedOrder;
import org.test_task.app.models.Triple;

import java.util.ArrayList;
import java.util.List;

class BasicDecomposerTest {

    @Test
    void decompose() {
        List<Digit> digits = new ArrayList<>();
        digits.add(new Digit("7", 0, Form.SINGLE));
        digits.add(new Digit("8", 1, Form.SINGLE));
        digits.add(new Digit("9", 2, Form.SINGLE));

        Triple triple1 = new Triple(digits, new NamedOrder(0));

        List<Digit> digits1 = new ArrayList<>();
        digits1.add(new Digit("4", 0, Form.SINGLE));
        digits1.add(new Digit("5", 1, Form.SINGLE));
        digits1.add(new Digit("6", 2, Form.SINGLE));

        Triple triple2 = new Triple(digits1, new NamedOrder(1));

        List<Digit> digits2 = new ArrayList<>();
        digits2.add(new Digit("1", 0, Form.SINGLE));
        digits2.add(new Digit("2", 1, Form.SINGLE));
        digits2.add(new Digit("3", 2, Form.SINGLE));
        Triple triple3 = new Triple(digits2, new NamedOrder(2));

        List<Triple> actual = new ArrayList<>();
        actual.add(triple1);
        actual.add(triple2);
        actual.add(triple3);

        List<Triple> expected = BasicDecomposer.Decompose("123456789");

        Assertions.assertEquals(expected, actual);

        digits.clear();
        digits.add(new Digit("7", 0, Form.SINGLE));
        digits.add(new Digit("8", 1, Form.SINGLE));
        digits.add(new Digit("9", 2, Form.SINGLE));

        triple1 = new Triple(digits, new NamedOrder(0));

        digits1.clear();
        digits1.add(new Digit("4", 0, Form.SINGLE));
        digits1.add(new Digit("5", 1, Form.SINGLE));
        digits1.add(new Digit("6", 2, Form.SINGLE));

        triple2 = new Triple(digits1, new NamedOrder(1));

        digits2.clear();
        digits2.add(new Digit("0", 0, Form.SINGLE));
        digits2.add(new Digit("2", 1, Form.SINGLE));
        digits2.add(new Digit("3", 2, Form.SINGLE));
        triple3 = new Triple(digits2, new NamedOrder(2));

        actual.clear();
        actual.add(triple1);
        actual.add(triple2);
        actual.add(triple3);

        expected = BasicDecomposer.Decompose("23456789");

        Assertions.assertEquals(expected, actual);

        digits.clear();
        digits.add(new Digit("7", 0, Form.SINGLE));
        digits.add(new Digit("8", 1, Form.SINGLE));
        digits.add(new Digit("9", 2, Form.SINGLE));

        triple1 = new Triple(digits, new NamedOrder(0));

        digits1.clear();
        digits1.add(new Digit("4", 0, Form.SINGLE));
        digits1.add(new Digit("5", 1, Form.SINGLE));
        digits1.add(new Digit("6", 2, Form.SINGLE));

        triple2 = new Triple(digits1, new NamedOrder(1));

        digits2.clear();
        digits2.add(new Digit("0", 0, Form.SINGLE));
        digits2.add(new Digit("0", 1, Form.SINGLE));
        digits2.add(new Digit("3", 2, Form.SINGLE));
        triple3 = new Triple(digits2, new NamedOrder(2));

        actual.clear();
        actual.add(triple1);
        actual.add(triple2);
        actual.add(triple3);

        expected = BasicDecomposer.Decompose("3456789");

        Assertions.assertEquals(expected, actual);
    }
}