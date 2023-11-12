package org.example;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

  private String nombre;
  private List<Materia> materiasAprobadas;

  // Constructor
  public Alumno(String nombre) {
    this.nombre = nombre;
    this.materiasAprobadas = new ArrayList<>();
  }

  // Agregar materias aprobadas
  public void aprobarMateria(Materia materia) {
    this.materiasAprobadas.add(materia);
  }

  // Devuelve una lista con las materias aprobadas por el alumno
  public List<Materia> getMateriasAprobadas () {
    return materiasAprobadas;
  }

  // Implementa la lógica para verificar si el alumno tiene las correlativas aprobadas.
  public Boolean tieneCorrelativasAprobadas(Materia materia) {
    // Retorna true si todas las correlativas están aprobadas, de lo contrario, false.
    for (Materia correlativa : materia.getCorrelativas()) {
      if (!this.getMateriasAprobadas().contains(correlativa)) {
        return false;
      }
    }
    return true;
  }



}
