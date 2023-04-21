package servicio;

import entidad.Batallon;
import entidad.Soldado;
import java.util.Scanner;

public class BatallonServicio {
    
    Scanner entrada = new Scanner(System.in);
    
    public Batallon crearBatallon(){
        Batallon batallon = new Batallon();
        System.out.println("Ingresá el numero del batallón");
        batallon.setNumero(entrada.nextInt());
        System.out.println("¿Cuantos soldados quiere agregar al batallon N°" + batallon.getNumero() + "?");
        batallon.setBatallon(new Soldado[entrada.nextInt()]);
        return batallon;
    }
    
    public void mostrarBatallon(Batallon batallon){
        System.out.println("Mostrando el batallón N°" + batallon.getNumero());
        for (int i = 0; i < batallon.getBatallon().length; i++) {
            System.out.println(batallon.getBatallon()[i].toString());
        }
    }
    
    public void ingresarSoldados(Batallon batallon){
        SoldadoServicio sc = new SoldadoServicio();
        for (int i = 0; i < batallon.getBatallon().length; i++) {
            Soldado soldado = sc.crearSoldado();
            batallon.getBatallon()[i] = soldado;
        }
    }
    
    public void ejercito(){
        Batallon batallonUno = crearBatallon();
        Batallon batallonDos = crearBatallon();
        ingresarSoldados(batallonUno);
        ingresarSoldados(batallonDos);
        mostrarBatallon(batallonUno);
        mostrarBatallon(batallonDos);
    }
}
