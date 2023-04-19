/*
    Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos en AhorcadoService:
    Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra en un índice del vector. Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.
    Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
    Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han sido encontradas y cuántas le faltan. Este método además deberá devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
    Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
    Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará cuando el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.
*/
package Service;

import entidad.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {
    
    Scanner entrada = new Scanner(System.in);
    
    public Ahorcado crearJuego(){
        Ahorcado ahorcado = new Ahorcado();
        System.out.println("Ingresá la palabra");
        String palabra = entrada.nextLine();
        ahorcado.setPalabra(new String[palabra.length()]);
        for (int i = 0; i < palabra.length(); i++) {
            ahorcado.getPalabra()[i] = palabra.substring(i, i + 1);
        }
        System.out.println("Ingresá la cantidad de intentos máximos");
        ahorcado.setJugadasMaximas(entrada.nextInt());
        return ahorcado;
    }
    
    public void longitud(Ahorcado ahorcado){
        System.out.println(ahorcado.getPalabra().length);
    }
    
    public void buscar(Ahorcado ahorcado){
        char letraUsuario, letra;
        System.out.println("Ingresá la letra a buscar");
        letraUsuario = entrada.next().charAt(0);
        for (int i = 0; i < ahorcado.getPalabra().length; i++) {
            letra = ahorcado.getPalabra()[i].charAt(0);
            if(letraUsuario == letra){
                encontradas(ahorcado, letraUsuario);
            }
        }
    }
    
    public boolean encontradas(Ahorcado ahorcado, char letra){
        for (int i = 0; i < ahorcado.getPalabra().length; i++) {
            if(letra == ahorcado.getPalabra()[i].charAt(0)){
                ahorcado.getPalabra()[i] = "";
                ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas() + 1);
                return true;
            }
        }
        ahorcado.setJugadasMaximas(ahorcado.getJugadasMaximas() - 1);
        return false;
    }
    
    public void intentos(Ahorcado ahorcado){
        System.out.println(ahorcado.getJugadasMaximas());
    }
    
    public Ahorcado juego(){
        Ahorcado ahorcado = crearJuego();
        return ahorcado;
    }
}

/*
    if(letra == ahorcado.getPalabra().charAt(i)){
                ahorcado.getPalabra()[i] = ahorcado.getPalabra()[i].substring(i, i + 1);
                ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas() + 1);
                break;
            }
*/