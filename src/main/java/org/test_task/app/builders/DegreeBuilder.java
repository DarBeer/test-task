package org.test_task.app.builders;

import org.test_task.app.enums.Gender;
import org.test_task.app.models.Degree;

public class DegreeBuilder extends Builder {
    private String name;
    private int number;
    private Gender gender;

    public DegreeBuilder () {
        this.name = "";
        this.number = 0;
        this.gender = Gender.MASCULINE;
    }

    public DegreeBuilder(Gender gender) {
        this.name = "";
        this.number = 0;
        this.gender = gender;
    }

    public Degree build() {
        Degree degree = new Degree();
        degree.setGender(this.gender);
        degree.setName(this.name);
        degree.setNumber(this.number);
        return degree;
    }
}
