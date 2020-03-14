package org.test_task.app.implementers;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.test_task.app.models.Degree;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

class JsonParserTest {

    @Test
    void convertToDegree() {
        String jsonString = "[\n" +
                "  {\n" +
                "    \"number\": \"0\",\n" +
                "    \"gender\": \"MASCULINE\",\n" +
                "    \"name\":\"\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"number\": \"1\",\n" +
                "    \"gender\": \"FEMININE\",\n" +
                "    \"name\":\"тысяч\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"nuber\": \"2\",\n" +
                "    \"gender\": \"MASCULINE\",\n" +
                "    \"name\":\"миллион\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"nuber\": \"3\",\n" +
                "    \"gender\": \"MASCULINE\",\n" +
                "    \"name\":\"миллиард\"\n" +
                "  }\n" +
                "]";
        Gson gson = new Gson();
        Type degree = new TypeToken<Collection<Degree>>(){}.getType();
        List<Degree> actual = gson.fromJson(jsonString, degree);

        List<Degree> expected = JsonParser.ConvertToDegree("./src/test/resources/Degree.json");

        Assertions.assertEquals(expected, actual);
    }
}