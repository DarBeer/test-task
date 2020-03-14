package org.test_task.app.implementers;

import org.jetbrains.annotations.NotNull;
import org.test_task.app.enums.Gender;
import org.test_task.app.models.Triple;

public class EndingCreater {
    @NotNull
    public static Triple AddEnding(Triple triple) {
        if ((Integer.parseInt(triple.getDigits().get(2).getSymbol()) == 1) &&
                (triple.getNamedOrder().getDegree().getGender() == Gender.FEMININE)) {
            if (Integer.parseInt(triple.getDigits().get(1).getSymbol()) == 1 ) {
                triple.getNamedOrder().setDescription(triple.getNamedOrder().getDescription() + "");
            } else {
                triple.getNamedOrder().setDescription(triple.getNamedOrder().getDescription() + "а");
            }
        }
        if (Integer.parseInt(triple.getDigits().get(2).getSymbol()) > 1 &&
                Integer.parseInt(triple.getDigits().get(2).getSymbol()) < 5 &&
                triple.getNamedOrder().getDegree().getGender() == Gender.FEMININE) {
            triple.getNamedOrder().setDescription(triple.getNamedOrder().getDescription() + "и");
        }
        if (Integer.parseInt(triple.getDigits().get(2).getSymbol()) > 1 &&
                triple.getNamedOrder().getDegree().getGender() == Gender.MASCULINE &&
                triple.getNamedOrder().getPossintionInLine() != 0) {
            triple.getNamedOrder().setDescription(triple.getNamedOrder().getDescription() + "а");
        }
        return triple;
    }
}
