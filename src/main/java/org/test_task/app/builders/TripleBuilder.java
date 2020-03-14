package org.test_task.app.builders;

import org.test_task.app.models.Digit;
import org.test_task.app.models.NamedOrder;
import org.test_task.app.models.Triple;

import java.util.List;

public class TripleBuilder extends Builder {
    private List<Digit> digits;
    private NamedOrder namedOrder;
    private String wordString;

    public TripleBuilder(List<Digit> digits, NamedOrder namedOrder) {
        this.digits = digits;
        this.namedOrder = namedOrder;
        this.wordString = "";
    }

    public Triple build () {
        Triple triple = new Triple();
        triple.setWordString(this.wordString);
        triple.setDigits(this.digits);
        triple.setNamedOrder(this.namedOrder);
        return triple;
    }
}
