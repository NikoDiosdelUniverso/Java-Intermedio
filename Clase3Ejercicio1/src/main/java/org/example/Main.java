package org.example;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> wordList = List.of("manzana", "banana", "pera", "frutilla", "naranja");
        int n = 5;
        InterfazPalabras interfaz = (words, n1) -> {
            StringBuilder result = new StringBuilder();

            for (String word : words) {
                if (word.length() > n1) {
                    if (result.length() > 0) {
                        result.append(", ");
                    }
                    result.append(word);
                }
            }

            return result.toString();
        };
        System.out.println("Palabras con mas de " + n + " letras: " + interfaz.WordsWithLengthGreaterThanN(wordList,n));
    }
}