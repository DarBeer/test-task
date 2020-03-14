package org.test_task.app.builders;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.test_task.app.enums.Gender;
import org.test_task.app.models.Degree;

import static org.junit.jupiter.api.Assertions.*;

class DegreeBuilderTest {

    @Test
    void build() {
        Degree expected = new Degree();
        expected.setGender(Gender.MASCULINE);
        expected.setName("");
        expected.setNumber(0);

        Assertions.assertEquals(expected, new DegreeBuilder().build());

        Assertions.assertEquals(expected, new DegreeBuilder(Gender.MASCULINE).build());
    }
}