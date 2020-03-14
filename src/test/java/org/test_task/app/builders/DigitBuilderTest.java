package org.test_task.app.builders;

import org.junit.jupiter.api.Test;
import org.test_task.app.enums.Form;
import org.test_task.app.enums.Gender;
import org.test_task.app.models.Digit;

import java.util.ArrayList;
import java.util.List;

class DigitBuilderTest {

    @Test
    void build() {
        List<Digit> actual = new ArrayList<>();
        List<Digit> expected = new ArrayList<>();
        Digit digit = new Digit();

        digit.setSymbol("");
        digit.setPositionInTriple(0);
        digit.setGender(Gender.MASCULINE);
        digit.setForm(Form.SINGLE);

        expected.add(digit);
        actual.add(new DigitBuilder().build());

        digit.setSymbol("1");
        digit.setPositionInTriple(0);
        digit.setGender(Gender.MASCULINE);
        digit.setForm(Form.SINGLE);

        expected.add(digit);
        actual.add(new DigitBuilder("1", 0).build());

        digit.setSymbol("1");
        digit.setPositionInTriple(0);
        digit.setGender(Gender.MASCULINE);
        digit.setForm(Form.PLURAL);

        expected.add(digit);
        actual.add(new DigitBuilder("1", 0, Form.PLURAL).build());

        digit.setSymbol("1");
        digit.setPositionInTriple(2);
        digit.setGender(Gender.FEMININE);
        digit.setForm(Form.PLURAL);

        expected.add(digit);
        actual.add(new DigitBuilder("1", 0, Gender.FEMININE , Form.PLURAL).build());

        digit.setSymbol("1");
        digit.setPositionInTriple(2);
        digit.setGender(Gender.FEMININE);
        digit.setForm(Form.SINGLE);

        expected.add(digit);
        actual.add(new DigitBuilder("1", 0, Gender.FEMININE).build());
    }
}