package org.test_task.app.models;

import org.test_task.app.enums.Gender;

import java.util.Objects;

public class Degree {
    private String name;
    private int number;
    private Gender gender;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Gender getGender() { return gender; }

    public void setGender(Gender gender) { this.gender = gender; }

    public int getNumber() { return number; }

    public void setNumber(int number) { this.number = number; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Degree degree = (Degree) o;
        return number == degree.number &&
                Objects.equals(name, degree.name) &&
                gender == degree.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number, gender);
    }

    @Override
    public String toString() {
        return "\nDegree{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", gender=" + gender +
                "}";
    }
}
