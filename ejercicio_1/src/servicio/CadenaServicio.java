/*
    Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una frase (String) y su longitud. Agregar constructor vacío y con atributo frase solamente. Agregar getters y setters. El constructor con frase como atributo debe setear la longitud de la frase de manera automática. 
    Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
    Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
    Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
    Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
*/

package servicio;

import entidad.Cadena;
import java.util.Scanner;

public class CadenaServicio {
    
    Scanner entrada = new Scanner(System.in);
    
    public Cadena crearFrase(){
        System.out.println("Ingresa la frase");
        Cadena cadena = new Cadena();
        cadena.setFrase(entrada.nextLine());
        cadena.setLongitud(cadena.getFrase().length());
        return cadena;
    }

    public void mostrarVocales(Cadena cadena){
        char letra;
        int contador = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            letra = cadena.getFrase().charAt(i);
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contador++;
            }
        }
        System.out.println("La cantidad de vocales son: " + contador);
    }
    
    public void invertirFrase(Cadena cadena){
        for (int i = cadena.getFrase().length() - 1; i >= 0; i--) {
            System.out.print(cadena.getFrase().charAt(i));
        }
        System.out.println("");
    }
    
    public void vecesRepetidas(Cadena cadena){
        System.out.println("Ingresa una letra");
        int contador = 0;
        char letra = entrada.next().charAt(0);
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if(letra == cadena.getFrase().charAt(i)){
                contador++;
            }
        }
        System.out.print("La letra se repite " + contador + " veces");
        System.out.println("");
    }
    
    public void compararLongitud(Cadena cadena){
        System.out.println("Ingresá la otra frase");
        entrada.skip("\n");
        String fraseUsuario = entrada.nextLine();
        if(fraseUsuario.length() == cadena.getLongitud()){
            System.out.println("Comparten la misma cantidad de caracteres");
        }else {
            System.out.println("No tienen la misma cantidad de caracteres");
        }
    }
    
    public void unirFrases(Cadena cadena){
        System.out.println("Ingresa una frase a únir");
        String fraseUsuario = entrada.nextLine();
        cadena.setFrase(cadena.getFrase() + fraseUsuario);
        System.out.println(cadena.getFrase());
        cadena.setLongitud(cadena.getFrase().length());
    }
    
    public void reemplazar(Cadena cadena){
        System.out.println("Ingresá la letra que reemplaza la a");
        String letra = entrada.next().substring(0, 1);
        String frase = "";
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if(cadena.getFrase().charAt(i) == 'a'){
                frase = frase + letra;
            }else {
                frase = frase + cadena.getFrase().charAt(i);
            }
        }
        cadena.setFrase(frase);
        cadena.setLongitud(cadena.getFrase().length());
    }
    
    public void contiene(Cadena cadena){
        System.out.println("Ingresá la letra");
        boolean contiene = false;
        char letra = entrada.next().charAt(0);
        for (int i = 0; i < cadena.getLongitud(); i++) {
            contiene = cadena.getFrase().charAt(i) == letra;
        }
        if(contiene){
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");
        }
    }
}
