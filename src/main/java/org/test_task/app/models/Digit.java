package org.test_task.app.models;

import org.test_task.app.enums.Form;
import org.test_task.app.enums.Gender;

import java.util.Objects;

public class Digit {
    private String symbol;
    private int positionInTriple;
    private Form form;
    private Gender gender = Gender.MASCULINE;

    public Digit() {}

    public Digit(String symbol, int positionInTriple) {
        this.positionInTriple = positionInTriple;
        this.symbol = symbol;
    }

    public Digit(String symbol, int positionInTriple, Form form) {
        this.positionInTriple = positionInTriple;
        this.symbol = symbol;
        this.form = form;
    }

    public Digit(String symbol, int positionInTriple, Gender gender) {
        this.positionInTriple = positionInTriple;
        this.symbol = symbol;
        this.gender = gender;
    }

    public Digit(String symbol, int positionInTriple, Gender gender, Form form) {
        this.positionInTriple = positionInTriple;
        this.symbol = symbol;
        this.gender = gender;
        this.form = form;
    }

    public String getSymbol() { return symbol; }

    public void setSymbol(String symbol) { this.symbol = symbol; }

    public Form getForm() { return form; }

    public void setForm(Form form) { this.form = form; }

    public Gender getGender() { return gender; }

    public void setGender(Gender gender) { this.gender = gender; }

    public int getPositionInTriple() { return positionInTriple; }

    public void setPositionInTriple(int positionInTriple) { this.positionInTriple = positionInTriple; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Digit digit = (Digit) o;
        return positionInTriple == digit.positionInTriple &&
                Objects.equals(symbol, digit.symbol) &&
                form == digit.form &&
                gender == digit.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, positionInTriple, form, gender);
    }

    @Override
    public String toString() {
        return "\nDigit{" +
                "symbol='" + symbol + '\'' +
                ", positionInTriple=" + positionInTriple +
                ", form=" + form +
                ", gender=" + gender +
                "}";
    }
}
