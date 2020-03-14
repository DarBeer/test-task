package org.test_task.app.implementers;

import org.test_task.app.enums.Form;
import org.test_task.app.models.Digit;

public class FormAnalyzer {
    public static Digit Analyze(Digit digit) {
        if (digit.getPositionInTriple() == 1) {
            if (digit.getSymbol().toCharArray()[0] == '1') {
                digit.setForm(Form.PLURAL);
            } else {
                digit.setForm(Form.SINGLE);
            }
        } else {
            digit.setForm(Form.SINGLE);
        }
        return digit;
    }
}
