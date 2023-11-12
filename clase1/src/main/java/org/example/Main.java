package org.example;

public class Main {
    public static void main(String[] args) {
        // Crear materias
        Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos");
        Materia paradigmas = new Materia("Paradigmas de Programación");
        Materia diseñoDeSistemas = new Materia("Diseño de Sistemas");

        // Definir correlativas
        paradigmas.agregarCorrelativa(algoritmos);
        diseñoDeSistemas.agregarCorrelativa(paradigmas);

        // Crear un alumno
        Alumno estudiante = new Alumno("Juan");

        // Aprobar materias
        estudiante.aprobarMateria(algoritmos);
        estudiante.aprobarMateria(paradigmas);

        // Crear inscripción
        Inscripcion inscripcion = new Inscripcion(diseñoDeSistemas, estudiante);

        // Verificar si la inscripción es válida
        if (inscripcion.aprobada()) {
            System.out.println("El alumno puede inscribirse en Diseño de Sistemas.");
        } else {
            System.out.println("El alumno no cumple con los requisitos de correlatividad.");
        }
    }
}