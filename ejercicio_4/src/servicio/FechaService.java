/*
    Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
    Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
    Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
    El método debe retornar el objeto Date.
    Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
    Si necesiten acá tienen más información en clase Date: Documentacion Oracle
*/
package servicio;

import java.util.Date;
import java.util.Scanner;

public class FechaService {
    
    Scanner entrada = new Scanner(System.in);
    
    public Date fechaDeNacimiento(){
        Date fecha = new Date();
        System.out.println("Ingresá el año");
        fecha.setYear(entrada.nextInt() - 1900);
        System.out.println("Ingresá el mes");
        fecha.setMonth(entrada.nextInt() - 1);
        System.out.println("Ingresá el día");
        fecha.setDate(entrada.nextInt());
        return fecha;
    }
    
    public Date fechaActual(){
        Date fecha = new Date();
        return fecha;
    }
    
    public void diferencia(Date fn, Date fa){
        System.out.println("Tiene " + (Math.abs(fn.getYear() - fa.getYear())) + " años");
    }
}
