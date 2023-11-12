package org.example;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

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
        lista.stream().filter((x)->x%2==0).forEach(System.out::println);
//------------------------------------------------------
        Predicate<Integer> predi = new Predicate<>(){
            @Override
            public boolean test(Integer t) {
                return t%2==0;
            }
        };
        lista.stream().filter(predi).forEach(System.out::println);
//--------------------------------------------------------
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona(33002394));
        listaPersonas.add(new Persona(50324053));
        listaPersonas.add(new Persona(10234953));
        listaPersonas.stream().filter((x)->x.getDni()>32000000).forEach((p)->System.out.println(p.getDni()));
    }
}