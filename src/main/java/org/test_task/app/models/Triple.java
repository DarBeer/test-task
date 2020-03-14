package org.test_task.app.models;

import java.util.List;
import java.util.Objects;

public class Triple {
    private List<Digit> digits;
    private NamedOrder namedOrder;
    private String wordString;

    public List<Digit> getDigits() { return digits; }

    public void setDigits(List<Digit> digits) { this.digits = digits; }

    public NamedOrder getNamedOrder() { return this.namedOrder; }

    public void setNamedOrder(NamedOrder namedOrder) { this.namedOrder = namedOrder; }

    public String getWordString() { return wordString; }

    public void setWordString(String wordString) { this.wordString = wordString; }

    public boolean isZero() {
        return digits.stream().allMatch( p -> p.getSymbol().equals("0"));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triple triple = (Triple) o;
        return Objects.equals(digits, triple.digits) &&
                Objects.equals(namedOrder, triple.namedOrder) &&
                Objects.equals(wordString, triple.wordString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(digits, namedOrder, wordString);
    }

    @Override
    public String toString() {
        return "\nTriple{" +
                "digits=" + digits +
                ", \nnamedOrder=" + namedOrder +
                ", \nwordString='" + wordString +
                "}";
    }
}
