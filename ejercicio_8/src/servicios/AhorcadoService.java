/*
    Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad jugadas máximas que puede realizar el usuario. 
    Definir los siguientes métodos en AhorcadoService:
    Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
        Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
        Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra en un índice del vector. 
        Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.
    Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
    Método buscar(letra): este método recibe una letra dada por el usuario y busca si la letra ingresada es parte de la palabra o no. 
        También informará si la letra estaba o no.
    Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han sido encontradas y cuántas le faltan. 
        Este método además deberá devolver true si la letra estaba y false si la letra no estaba, ya que, 
        cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
    Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
    Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará cuando el usuario descubra toda la palabra o se quede sin intentos. 
        Este método se llamará en el main.
*/
package servicios;

import entidad.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {
    
    Scanner entrada = new Scanner(System.in);
    
    public Ahorcado crearJuego(){
        Ahorcado ahorcado = new Ahorcado();
        System.out.println("Ingresá la palabra");
        String palabra = entrada.next();
        palabra = palabra.toLowerCase();
        ahorcado.setPalabra(new String[palabra.length()]);
        for (int i = 0; i < ahorcado.getPalabra().length; i++) {
            ahorcado.getPalabra()[i] = palabra.substring(i, i + 1);
        }
        System.out.println("Ingresá la cantidad de intentos");
        ahorcado.setIntentos(entrada.nextInt());
        return ahorcado;
    }
    
    public int longitud(Ahorcado ahorcado){
        return ahorcado.getPalabra().length;
    }
    
    public String buscar(Ahorcado ahorcado){
        System.out.println("Ingresa la letra a buscar");
        String letra = entrada.next().substring(0, 1);
        letra = letra.toLowerCase();
        for (int i = 0; i < ahorcado.getPalabra().length; i++) {
            if(ahorcado.getPalabra()[i].equals(letra)){
                System.out.println("La letra " + letra + " es parte de la palabra");
                return letra;
            }
        }
        System.out.println("La letra " + letra + " NO es parte de la palabra");
        return letra;
    }
    
    public boolean encontradas(Ahorcado ahorcado, String letra){
        for (int i = 0; i < ahorcado.getPalabra().length; i++) {
            if(ahorcado.getPalabra()[i].equals(letra)){
                ahorcado.getPalabra()[i] = "";
                return true;
            }
        }
        return false;
    }
    
    public int intentos(Ahorcado ahorcado){
        return ahorcado.getIntentos();
    }
    
    public void juego(){
        String letra;
        Ahorcado ahorcado = crearJuego();
        String palabra = "";
        
        int longitud = longitud(ahorcado);
        do{
            System.out.println("----------------------------------------------------------");
            letra = buscar(ahorcado);
            if(encontradas(ahorcado, letra)){
                palabra = palabra + letra;
                ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas() + 1);
                System.out.println("letras encontradas: " + ahorcado.getLetrasEncontradas());
            }else {
                ahorcado.setIntentos(ahorcado.getIntentos() - 1);
                if(ahorcado.getIntentos() == 1) {
                    System.out.println("Te queda el ultimo intento");
                }else {
                    System.out.println("Te quedan " + ahorcado.getIntentos() + " intentos.");
                }
            }
        }while(ahorcado.getIntentos() != 0 && ahorcado.getLetrasEncontradas() != longitud);
        
        if(ahorcado.getIntentos() > 0){
            System.out.println("Felicitaciones, acertaste.");
        }else {
            System.out.println("No adivinaste, lo siento");
        }
        System.out.println("La palabra era: " + palabra);
    }
}
