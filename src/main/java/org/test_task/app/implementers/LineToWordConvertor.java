package org.test_task.app.implementers;

import org.test_task.app.models.Degree;
import org.test_task.app.models.Digit;
import org.test_task.app.models.Triple;

import java.util.ArrayList;
import java.util.List;

public class LineToWordConvertor {
    public static String Convert(String input) {
        String path = "./src/main/resources/Degree.json";

        ArrayList<Degree> degrees = JsonParser.ConvertToDegree(path);

        List<Triple> triples = BasicDecomposer.Decompose(input);
        StringBuilder result = new StringBuilder();

        for (Triple triple: triples) {
            triple = GenderAnalyzer.Analyze(triple);
            for (Digit digit: triple.getDigits()) {
                digit = FormAnalyzer.Analyze(digit);
            }
            triple.getNamedOrder().setDegree(degrees.get(triple.getNamedOrder().getPossintionInLine()));
            triple.getNamedOrder().setDescription(triple.getNamedOrder().getDegree().getName());
            triple = EndingCreater.AddEnding(TripleToWordConvertor.DigitToString(triple));
            result.insert(0, triple.getWordString() + triple.getNamedOrder().getDescription() + " ");
        }

        return result.substring(0, result.length() - 2);
    }
}
