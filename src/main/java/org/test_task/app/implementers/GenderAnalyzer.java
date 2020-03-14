package org.test_task.app.implementers;

import org.test_task.app.enums.Gender;
import org.test_task.app.models.Digit;
import org.test_task.app.models.Triple;

import java.util.List;

public class GenderAnalyzer {
    public static Triple Analyze(Triple triple) {
        if (triple.getNamedOrder().getPossintionInLine() == 1) {
            if (Integer.parseInt(triple.getDigits().get(2).getSymbol()) < 5) {
                List<Digit> digits = triple.getDigits();
                triple.getNamedOrder().setGender(Gender.FEMININE);
                digits.get(2).setGender(Gender.FEMININE);
                triple.setDigits(digits);
            }
        }
        return triple;
    }
}
