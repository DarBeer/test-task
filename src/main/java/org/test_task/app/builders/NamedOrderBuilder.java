package org.test_task.app.builders;

import org.test_task.app.enums.Form;
import org.test_task.app.enums.Gender;
import org.test_task.app.models.Degree;
import org.test_task.app.models.NamedOrder;

public class NamedOrderBuilder extends Builder {
    private Degree degree;
    private String description;
    private Gender gender;
    private Form form;
    private int possintionInLine;

    public NamedOrderBuilder() {
        this.possintionInLine = 0;
        this.gender = Gender.MASCULINE;
        this.description = "";
        this.degree = new DegreeBuilder().build();
    }

    public NamedOrderBuilder(int possintionInLine) {
        this.possintionInLine = possintionInLine;
        this.gender = Gender.MASCULINE;
        this.description = "";
        this.degree = new DegreeBuilder().build();
    }

    public NamedOrderBuilder(int possintionInLine, Gender gender) {
        this.possintionInLine = possintionInLine;
        this.gender = gender;
        this.description = "";
        this.degree = new DegreeBuilder().build();
    }

    public NamedOrderBuilder(int possintionInLine, Gender gender, String description, Gender degreeGender) {
        this.possintionInLine = possintionInLine;
        this.gender = gender;
        this.description = description;
        this.degree = new DegreeBuilder(degreeGender).build();
    }

    public NamedOrder build() {
        NamedOrder namedOrder = new NamedOrder();
        namedOrder.setDegree(this.degree);
        namedOrder.setDescription(this.description);
        namedOrder.setGender(this.gender);
        namedOrder.setForm(this.form);
        namedOrder.setPossintionInLine(this.possintionInLine);
        return namedOrder;
    }
}
