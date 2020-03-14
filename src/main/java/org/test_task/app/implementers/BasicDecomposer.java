package org.test_task.app.implementers;

import org.test_task.app.builders.NamedOrderBuilder;
import org.test_task.app.builders.TripleBuilder;
import org.test_task.app.models.Triple;

import java.util.ArrayList;
import java.util.List;

public class BasicDecomposer {
    public static List<Triple> Decompose (String input) {
        List<Triple> triples = new ArrayList<>();
        int position = 0;
        switch ((input.length()) % 3) {
            case 0: {
                for (int i = input.length() - 1; i > -1; i -= 3) {
                    String tripleLine = input.substring(i - 2, i + 1);
                    triples.add(new TripleBuilder(ForTripleDecomposer.Decompouse(tripleLine), new NamedOrderBuilder(position).build()).build());
                    position++;
                }
            } break;
            case 1: {
                for (int i = input.length() - 1; i > 2; i -= 3) {
                    String tripleLine = input.substring(i - 2, i + 1);
                    triples.add(new TripleBuilder(ForTripleDecomposer.Decompouse(tripleLine), new NamedOrderBuilder(position).build()).build());
                    position++;
                }
                String tripleLine = "00" + input.substring(0, 1);
                triples.add(new TripleBuilder(ForTripleDecomposer.Decompouse(tripleLine), new NamedOrderBuilder(position).build()).build());
            } break;
            case 2: {
                for (int i = input.length() - 1; i > 2; i -= 3) {
                    String tripleLine = input.substring(i - 2, i + 1);
                    triples.add(new TripleBuilder(ForTripleDecomposer.Decompouse(tripleLine), new NamedOrderBuilder(position).build()).build());
                    position++;
                }
                String tripleLine = "0" + input.substring(0, 2);
                triples.add(new TripleBuilder(ForTripleDecomposer.Decompouse(tripleLine), new NamedOrderBuilder(position).build()).build());
            } break;
        }
        return triples;
    }
}
