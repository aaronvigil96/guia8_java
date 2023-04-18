/*
    Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
    Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
    Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
    Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
    Método mostrarPersona que muestra la información de la persona deseada.
*/
package servicio;

import entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    
    Scanner entrada = new Scanner(System.in);
    
    public Persona crearPersona(){
        int dia, mes, anio;
        Persona persona = new Persona();
        System.out.println("Ingresá el nombre");
        persona.setNombre(entrada.nextLine());
        System.out.println("Ingresá el día que naciste");
        dia = entrada.nextInt();
        System.out.println("Ingresá el més que naciste");
        mes = entrada.nextInt();
        System.out.println("Ingresá el año que naciste");
        anio = entrada.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        persona.setFecha(fecha);
        return persona;
    }
    
    public int calcularEdad(Persona persona){
        Date fechaActual = new Date();
        int edad = Math.abs(persona.getFecha().getYear() - fechaActual.getYear());
        return edad;
    }
    
    public boolean menorQue(Persona persona){
        System.out.println("Ingresá la edad a comprar");
        int edad = entrada.nextInt();
        return calcularEdad(persona) < edad;
    }
    
    public void mostrarPersona(Persona persona){
        System.out.println(persona.getNombre() + " nació el " + persona.getFecha() + " y tiene " + calcularEdad(persona) + " años.");
    }
}
