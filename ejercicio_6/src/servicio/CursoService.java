/*
    Uso de vectores como atributos de clase
    Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un programa para organizar la información de cada curso. Para ello, crearemos una clase entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde),  precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
    Un constructor por defecto.
    Un constructor con todos los atributos como parámetro.
    Métodos getters y setters de cada atributo.
    Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases. Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el nombre de cada alumno.
    Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Curso. En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
    Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.
*/
package servicio;

import entidad.Curso;
import java.util.Scanner;

public class CursoService {
    
    Scanner entrada = new Scanner(System.in);
    
    public Curso crearCurso(){
        Curso curso = new Curso();
        System.out.println("Nombre del curso: ");
        curso.setNombreCurso(entrada.next());
        System.out.println("Ingresá la cantidad de horas por día: ");
        curso.setCantidadHorasPorDia(entrada.nextInt());
        System.out.println("Ingresá la cantidad de días por semana: ");
        curso.setCantidadDiasPorSemana(entrada.nextInt());
        System.out.println("Ingresá el turno: ");
        curso.setTurno(entrada.next());
        System.out.println("Ingresá el precio por hora: ");
        curso.setPrecioPorHora(entrada.nextInt());
        cargarAlumno(curso);
        return curso;
    }
    
    public void cargarAlumno(Curso curso){
        for (int i = 0; i < curso.getAlumnos().length; i++) {
            System.out.println("Ingresá el nombre del alumno");
            curso.getAlumnos()[i] = entrada.next();
        }
    }
    
    public void calcularGananciaSemanal(Curso curso){
        System.out.println("La ganancia semanal es: " + (curso.getCantidadHorasPorDia() * curso.getPrecioPorHora() * curso.getAlumnos().length * curso.getCantidadDiasPorSemana()));
    }
}
