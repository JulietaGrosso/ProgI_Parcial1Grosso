package model;

import java.util.ArrayList;

public class Academia {
  private ArrayList<Curso>cursosArray;
  private float totalIngresos;
  private int inscripciones;


  public Academia(float totalIngresos, int inscripciones){
    this.cursosArray = new ArrayList<>();
    this.totalIngresos = totalIngresos;
    this.inscripciones = inscripciones;
  }


  public float getTotalIngresos() {
    return totalIngresos;
  }

  public void setTotalIngresos(float totalIngresos) {
    this.totalIngresos = totalIngresos;
  }

  public int getInscripciones() {
    return inscripciones;
  }

  public void setInscripciones(int inscripciones) {
    this.inscripciones = inscripciones;
  }

  public void agregarCurso(Curso c){
    this.cursosArray.add(c);
  }

  public Curso obtenerCurso(String codigo){
    for(Curso curso : cursosArray){
      if(curso.getCodigo().equals(codigo)){
        return curso;
      }
    }
    return null;
  }

  public void inscribirEstudiante(String codigoCurso){
    Curso codigo = obtenerCurso(codigoCurso);
    if(codigoCurso == null){
      throw new CursoNoDisponibleException("Curso no disponible");
    }else{
      this.cursosArray.remove(codigo);
    }
  }

  public void mostrarCursosDisponibles(){
    System.out.println("Los cursos disponibles son: ");
    for(Curso curso : this.cursosArray){
      System.out.println(curso.toString());
    }
  }
}
