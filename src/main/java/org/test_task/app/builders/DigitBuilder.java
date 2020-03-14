package org.test_task.app.builders;

import org.test_task.app.enums.Form;
import org.test_task.app.enums.Gender;
import org.test_task.app.models.Digit;

public class DigitBuilder extends Builder {
    private String symbol;
    private int positionInTriple;
    private Form form;
    private Gender gender;

    public DigitBuilder() {
        this.form = Form.SINGLE;
        this.gender = Gender.MASCULINE;
        this.positionInTriple = 0;
        this.symbol = "";
    }

    public DigitBuilder(String symbol, int positionInTriple) {
        this.positionInTriple = positionInTriple;
        this.symbol = symbol;
        this.form = Form.SINGLE;
        this.gender = Gender.MASCULINE;
    }

    public DigitBuilder(String symbol, int positionInTriple, Form form) {
        this.positionInTriple = positionInTriple;
        this.symbol = symbol;
        this.form = form;
        this.gender = Gender.MASCULINE;
    }

    public DigitBuilder(String symbol, int positionInTriple, Gender gender) {
        this.positionInTriple = positionInTriple;
        this.symbol = symbol;
        this.gender = gender;
        this.form = Form.SINGLE;
    }

    public DigitBuilder(String symbol, int positionInTriple, Gender gender, Form form) {
        this.positionInTriple = positionInTriple;
        this.symbol = symbol;
        this.gender = gender;
        this.form = form;
    }

    public Digit build() {
        Digit digit = new Digit();
        digit.setForm(this.form);
        digit.setGender(this.gender);
        digit.setPositionInTriple(this.positionInTriple);
        digit.setSymbol(this.symbol);
        return digit;
    }
}
