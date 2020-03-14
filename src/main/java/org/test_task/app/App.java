package org.test_task.app;

import org.test_task.app.implementers.LineToWordConvertor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество тестов: ");
        int countTest = Integer.parseInt(scanner.nextLine());

        List<String> inputStrings = new ArrayList<>();
        List<String> actualStrings = new ArrayList<>();

        for (int i = 0; i < countTest; i++) {
            System.out.print("Введите исходное значение: ");
            inputStrings.add(scanner.nextLine());
            System.out.print("Введите результат: ");
            actualStrings.add(scanner.nextLine());
        }

        for (int i = 0; i < countTest; i++) {
            boolean testResult = (LineToWordConvertor.Convert(inputStrings.get(i)) == actualStrings.get(i));
            System.out.println("Тест " + (testResult ? "завершен успешно" : "провален") + " результат: " + LineToWordConvertor.Convert(inputStrings.get(i)));
            if (!testResult) {
                System.out.println("\tИсходное число: " + inputStrings.get(i));
                System.out.println("\tОжидаемый результат: " + actualStrings.get(i));
                System.out.println("\tРеальный результат: " + LineToWordConvertor.Convert(inputStrings.get(i)));
            }
        }
    }
}
