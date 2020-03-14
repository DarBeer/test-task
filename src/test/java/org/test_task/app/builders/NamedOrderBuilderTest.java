package org.test_task.app.builders;

import org.junit.jupiter.api.Test;
import org.test_task.app.enums.Gender;
import org.test_task.app.models.NamedOrder;

import java.util.ArrayList;
import java.util.List;

class NamedOrderBuilderTest {

    @Test
    void build() {
        List<NamedOrder> actual = new ArrayList<>();
        List<NamedOrder> expected = new ArrayList<>();
        NamedOrder namedOrder = new NamedOrder();

        namedOrder.setPossintionInLine(0);
        namedOrder.setGender(Gender.MASCULINE);
        namedOrder.setDescription("");
        namedOrder.setDegree(new DegreeBuilder().build());

        actual.add(new NamedOrderBuilder().build());
        expected.add(namedOrder);

        namedOrder.setPossintionInLine(1);
        namedOrder.setGender(Gender.MASCULINE);
        namedOrder.setDescription("");
        namedOrder.setDegree(new DegreeBuilder().build());

        actual.add(new NamedOrderBuilder(1).build());
        expected.add(namedOrder);

        namedOrder.setPossintionInLine(2);
        namedOrder.setGender(Gender.FEMININE);
        namedOrder.setDescription("");
        namedOrder.setDegree(new DegreeBuilder().build());

        actual.add(new NamedOrderBuilder(2, Gender.FEMININE).build());
        expected.add(namedOrder);

        namedOrder.setPossintionInLine(3);
        namedOrder.setGender(Gender.FEMININE);
        namedOrder.setDescription("des");
        namedOrder.setDegree(new DegreeBuilder(Gender.FEMININE).build());

        actual.add(new NamedOrderBuilder(2, Gender.FEMININE, "des", Gender.FEMININE).build());
        expected.add(namedOrder);
    }
}