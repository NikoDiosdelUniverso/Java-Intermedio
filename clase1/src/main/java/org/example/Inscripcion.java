package org.example;

public class Inscripcion {

  private Materia materia;
  private Alumno alumno;

  // Constructor
  public Inscripcion(Materia materia, Alumno alumno) {
    this.materia = materia;
    this.alumno = alumno;
  }

  // La inscripcion es aprobada si el alumno tiene las correlativas aprobadas
  public Boolean aprobada()
  {
    return alumno.tieneCorrelativasAprobadas(materia);
  }
}
