package model;

public class CursoPython extends Curso implements Inscribible{
  private Double porcDescuento;
  public CursoPython(String codigo, String nombre, int duracionHoras, float precioBase, Double porcDescuento){
    super(codigo, nombre, duracionHoras, precioBase);
    this.porcDescuento = porcDescuento;
  }

  public Double getPorcDescuento() {
    return porcDescuento;
  }

  public void setPorcDescuento(Double porcDescuento) {
    this.porcDescuento = porcDescuento;
  }

  @Override
  public String getLenguaje() {
    return "Python";
  }

  @Override
  public String toString() {
    return getLenguaje();
  }

  @Override
  public float calcularCostoFinal() {
    Double resultado;
    resultado = getPrecioBase() - (getPrecioBase() * getPorcDescuento());
    return resultado.floatValue();
  }
}
