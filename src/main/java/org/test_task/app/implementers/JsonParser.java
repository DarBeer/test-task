package org.test_task.app.implementers;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import org.test_task.app.models.Degree;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;

public class JsonParser {
    public static ArrayList<Degree> ConvertToDegree(String path) {
        ArrayList<Degree> myData = null;
        try {
            Gson gson = new Gson();
            JsonReader reader = new JsonReader(new FileReader(path));
            Type degree = new TypeToken<Collection<Degree>>(){}.getType();
            myData = gson.fromJson(reader, degree);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return myData;
    }
}
