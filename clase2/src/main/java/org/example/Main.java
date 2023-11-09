package org.example;

import java.util.ArrayList;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(4);
        //paradigma funcional
        for (Integer n: lista
             ) {
            if (n == 3) {
                System.out.println("Se encontro el numero 3");
        }}
        //paradigma declarativo
        System.out.println(lista.contains(3)?"esta":"no esta");

        ImplementaInterfaz interfaz = new ImplementaInterfaz();
        System.out.println(interfaz.suma(23, 43));

        Interfase interfaz2 = new ImplementaInterfaz();
        System.out.println(interfaz2.suma(23, 43));

        //metodo anonimo
        Interfase interfaz3 = new Interfase() {
            @Override
            public int suma(int numero1, int numero2) {
                return numero1+numero2;
            }
        };
        System.out.println(interfaz3.suma(23, 43));

        //expresion lambda (funcional)
        Interfase interfaz4 = (numero1, numero2) -> numero1+numero2;
        System.out.println(interfaz4.suma(23, 43));

        //stream
        lista.stream().map((x)->x*x).forEach(System.out::println);

        //interfaz function
        Function<Integer,Integer> exponente = new Function<>() {

            @Override
            public Integer apply(Integer integer) {
                return integer*integer;
            }
        };
        //lambda usando la interfaz Function
        Function<Integer,Integer> exponent = integer -> integer*integer;

        //
        lista.stream().filter();
    }
}