package org.test_task.app.implementers;

import org.test_task.app.models.Digit;

import java.util.ArrayList;
import java.util.List;

public class ForTripleDecomposer {
    public static List<Digit> Decompouse(String input) {
        List<Digit> digits = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String symbol = input.substring(i, i + 1);
            digits.add(FormAnalyzer.Analyze(new Digit(symbol, i)));
        }
        return digits;
    }
}
