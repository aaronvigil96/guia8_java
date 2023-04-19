/*
    Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales. Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
    Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
    Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
    Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
    Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
    En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
*/
package service;

import java.util.Arrays;

public class ArregloService {
    public void inicializarA(double arreglo[]){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Math.random() * 10;
        }
    }
    
    public void mostrar(double arreglo[]){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(i + 1 + ": " + arreglo[i]);
        }
    }
    
    public void ordernar(double arreglo[]){
        double[] numeros = new double[arreglo.length];
        int contador = 0;
        Arrays.sort(arreglo);
        for (int i = arreglo.length - 1; i >= 0; i--) {
            numeros[contador] = arreglo[i];
            contador++;
        }
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = numeros[i];
            System.out.println(arreglo[i]);
        }
    }
    
    public void inicializarB(double arregloA[], double arregloB[]){
        for (int i = 0; i < arregloB.length; i++) {
            if(i < 10){
                arregloB[i] = arregloA[i];
            }else {
                arregloB[i] = 0.5;
            }
        }
    }
}
