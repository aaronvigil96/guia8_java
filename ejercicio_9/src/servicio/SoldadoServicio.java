package servicio;

import entidad.Soldado;
import java.util.Scanner;

public class SoldadoServicio {
    
    Scanner entrada = new Scanner(System.in);
    
    public Soldado crearSoldado(){
        Soldado soldado = new Soldado();
        System.out.println("Ingresá el nombre del soldado");
        soldado.setNombre(entrada.next());
        System.out.println("Ingresá la edad del soldado (tiene que ser mayor a 17 y menor a 70)");
        soldado.setEdad(entrada.nextInt());
        System.out.println("Ingresá el sexo del soldado");
        soldado.setSexo(entrada.next());
        return soldado;
    }
    
    public void mostrarSoldado(Soldado soldado){
        System.out.println("El soldado " + soldado.getNombre() + " tiene " + soldado.getEdad() + " años y es " + soldado.getSexo());
    }
}
