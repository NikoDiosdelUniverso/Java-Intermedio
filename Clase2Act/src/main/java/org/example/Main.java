package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static org.example.Main.StringTransformer.transformStrings;

public class Main {
    public static class StringTransformer {
        public static List<String> transformStrings(List<String> inputList, Function<String, String> transformer) {
            List<String> transformedList = new ArrayList<>();

            for (String input : inputList) {
                String transformedString = transformer.apply(input);
                transformedList.add(transformedString);
            }

            return transformedList;
        }
    }
    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>();
        inputList.add("Hola");
        inputList.add("Mundo");
        inputList.add("Java");

        // Definir una función lambda para transformar a mayúsculas
        Function<String, String> toUpperCase = String::toUpperCase;

        List<String> transformedList = transformStrings(inputList, toUpperCase);

        for (String transformedString : transformedList) {
            System.out.println(transformedString);
        }
    }
}