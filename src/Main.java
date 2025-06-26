import model.*;


public class Main {
  public static void main(String[] args) {
    //Instancias:
    Curso java = new CursoJava("978jjm", "Curso POO", 8, 40000, 0.10);
    Curso python = new CursoPython("789ggj", "Curso Principiantes", 5, 30000, 0.20);

    Academia academia = new Academia(60000, 10);

    //Se agregan cursos a la Academia:
    academia.agregarCurso(java);
    academia.agregarCurso(python);

    //Se muestran en pantalla los cursos disponibles:
    academia.mostrarCursosDisponibles();


    //Se inscribe un estudiante al Curso Poo, a través del código:
    academia.inscribirEstudiante("978jjm");
    System.out.println("Estudiante inscripto en: " + java.getNombre() + " .Lenguaje: " + java.toString());
    System.out.println("Duración del curso: " + java.getDuracionHoras() + " .Precio: " + java.getPrecioBase());


    //Manejo de la Excepción a través del código, en caso de que no esté disponible muestra por pantalla el mensaje:
    try{
      academia.inscribirEstudiante("978mmj");
    }catch (CursoNoDisponibleException e){
      System.out.println("El curso no se encuentra disponible en la academia");
    }



  }
}