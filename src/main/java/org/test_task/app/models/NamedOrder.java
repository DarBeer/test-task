package org.test_task.app.models;

import org.test_task.app.enums.Form;
import org.test_task.app.enums.Gender;

import java.util.Objects;

public class NamedOrder {
    private Degree degree;
    private String description;
    private Gender gender;
    private Form form;
    private int possintionInLine;

    public int getPossintionInLine() { return possintionInLine; }

    public void setPossintionInLine(int possintionInLine) { this.possintionInLine = possintionInLine; }

    public Form getForm() { return form; }

    public void setForm(Form form) { this.form = form; }

    public Gender getGender() { return gender; }

    public void setGender(Gender gender) { this.gender = gender; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public Degree getDegree() { return degree; }

    public void setDegree(Degree degree) { this.degree = degree; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NamedOrder that = (NamedOrder) o;
        return possintionInLine == that.possintionInLine &&
                Objects.equals(degree, that.degree) &&
                Objects.equals(description, that.description) &&
                gender == that.gender &&
                form == that.form;
    }

    @Override
    public int hashCode() {
        return Objects.hash(degree, description, gender, form, possintionInLine);
    }

    @Override
    public String toString() {
        return "\nNamedOrder{" +
                "degree=" + degree +
                ", description='" + description + '\'' +
                ", gender=" + gender +
                ", form=" + form +
                ", possintionInLine=" + possintionInLine +
                '}';
    }
}
