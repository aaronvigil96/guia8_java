/*
    Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos van a ser nombre y nota (representando la nota obtenida en el final). 
    La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8 estudiantes con sus respectivas notas.
    Una vez creado los estudiantes deberemos guardar los estudiantes en un arreglo de objetos tipo Estudiante, 
    usando ese arreglo tenemos que realizar las dos tareas que nos ha pedido la escuela.
    Calcular y mostrar el promedio de notas de todo el curso
    Retornar otro arreglo con los nombre de los alumnos que recibieron una nota mayor al promedio del curso
    Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio.
    Nota: para crear un vector de objetos la definición es la siguiente:
    Objeto nombreVector[] = new Objeto[];
*/
package servicio;

import entidad.Estudiante;
import java.util.Scanner;

public class EstudianteServicio {
    
    Scanner entrada = new Scanner(System.in);
    
    public void crearAlumnos(Estudiante estudiantes[]){
        Estudiante estudiante;
        double nota;
        String nombre;
        
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Ingresá el nombre");
            nombre = entrada.next();
            System.out.println("Ingresá la nota");
            nota = entrada.nextDouble();
            estudiante = new Estudiante(nombre, nota);
            estudiantes[i] = estudiante;
        }
    }
    
    public void mostrarAlumnos(Estudiante estudiantes[]){
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i].toString());
        }
    }
    
    public Estudiante[] mostrarPromedio(Estudiante estudiantes[]){
        double total = 0;
        int mayorPromedio = 0;
        Estudiante array[];
        for (int i = 0; i < estudiantes.length; i++) {
            total += estudiantes[i].getNota();
        }
        total = total / estudiantes.length;
        System.out.println("-----------------------------------------");
        System.out.println("EL PROMEDIO ES: " + total);
        System.out.println("-----------------------------------------");
        for (int i = 0; i < estudiantes.length; i++) {
            if(estudiantes[i].getNota() > total){
                mayorPromedio++;
            }
        }
        array = new Estudiante[mayorPromedio];
        int contador = 0;
        for (int i = 0; i < estudiantes.length; i++) {
            if(estudiantes[i].getNota() > total){
                array[contador] = estudiantes[i];
                contador++;
            }
        }
        return array;
        
    }
    
    public void ejecutarAplicacion(){
        Estudiante estudiantes[] = new Estudiante[8];
        crearAlumnos(estudiantes);
        mostrarAlumnos(estudiantes);
        Estudiante mayorPromedio[] = mostrarPromedio(estudiantes);
        for (int i = 0; i < mayorPromedio.length; i++) {
            System.out.println(mayorPromedio[i].toString());
        }
    }
}
