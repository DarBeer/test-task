package org.test_task.app.implementers;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.test_task.app.enums.Form;
import org.test_task.app.enums.Gender;
import org.test_task.app.models.Digit;
import org.test_task.app.models.Triple;

public class TripleToWordConvertor {
    private static String[][] sex = {
            {"","один","два","три","четыре","пять","шесть","семь","восемь","девять"},
            {"","одна","две","три","четыре","пять","шесть","семь","восемь","девять"},
    };

    private static String[] str100= {"","сто","двести","триста","четыреста","пятьсот","шестьсот","семьсот", "восемьсот","девятьсот"};
    private static String[] str11 = {"","десять","одиннадцать","двенадцать","тринадцать","четырнадцать", "пятнадцать","шестнадцать","семнадцать","восемнадцать","девятнадцать","двадцать"};
    private static String[] str10 = {"","десять","двадцать","тридцать","сорок","пятьдесят","шестьдесят", "семьдесят","восемьдесят","девяносто"};

    @NotNull
    @Contract("_ -> param1")
    public static Triple DigitToString (@NotNull Triple triple) {
        StringBuilder result = new StringBuilder();
        boolean pluralForm = false;
        for (Digit digit: triple.getDigits()) {
            switch ((int)digit.getPositionInTriple()) {
                case 0: {
                    if (!digit.getSymbol().equals("") && !digit.getSymbol().equals("0")) {
                        result.append(str100[Integer.parseInt(digit.getSymbol())]).append(" "); break;
                    }
                }
                case 1: {
                    if (!digit.getSymbol().equals("") && !digit.getSymbol().equals("0")) {
                        if (digit.getForm() == Form.PLURAL && !triple.getDigits().get(2).getSymbol().equals("0")) {
                            pluralForm = true;
                        } else {
                            pluralForm = false;
                            result.append(str10[Integer.parseInt(digit.getSymbol())]).append(" ");
                        } break;
                    }
                }
                case 2: {
                    if (!digit.getSymbol().equals("") && !digit.getSymbol().equals("0")) {
                        if (pluralForm == false) {
                            if (digit.getGender() == Gender.MASCULINE) {
                                result.append(sex[0][Integer.parseInt(digit.getSymbol())]).append(" ");
                            } else {
                                result.append(sex[1][Integer.parseInt(digit.getSymbol())]).append(" ");
                            }
                        } else {
                            result.append(str11[Integer.parseInt(digit.getSymbol()) + 1]).append(" ");
                        }
                    }
                } break;
            }
        }
        triple.setWordString(result.toString());
        return triple;
    }
}
