package model;

public abstract class Curso {
  private String codigo;
  private String nombre;
  private int duracionHoras;
  private float precioBase;


  public Curso (String codigo, String nombre, int duracionHoras, float precioBase){
    this.codigo = codigo;
    this.nombre = nombre;
    this.duracionHoras = duracionHoras;
    this.precioBase = precioBase;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getDuracionHoras() {
    return duracionHoras;
  }

  public void setDuracionHoras(int duracionHoras) {
    this.duracionHoras = duracionHoras;
  }

  public float getPrecioBase() {
    return precioBase;
  }

  public void setPrecioBase(float precioBase) {
    this.precioBase = precioBase;
  }

  public abstract String getLenguaje();

  public abstract String toString();

}
