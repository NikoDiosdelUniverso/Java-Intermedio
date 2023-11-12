package org.example;

public class Persona {
    private int dni;
    public Persona(int dni) {
        this.dni = dni;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + '}';
    }
}
