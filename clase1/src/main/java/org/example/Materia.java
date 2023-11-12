package org.example;

import java.util.ArrayList;
import java.util.List;

public class Materia {

  private String nombre;
  private List<Materia> correlativas;

  // Constructor
  public Materia(String nombre) {
    this.nombre = nombre;
    this.correlativas = new ArrayList<>();
  }

  // Devuelve la lista de correlativas de la materia
  public List<Materia> getCorrelativas () {
    return correlativas;
  }

  // Agrega una materia correlativa
  public void agregarCorrelativa(Materia materia) {
    this.correlativas.add(materia);
  }

}
