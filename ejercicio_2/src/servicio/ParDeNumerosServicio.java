/*
    Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales con los cuales se realizarán diferentes operaciones matemáticas. La clase debe tener un constructor vacío, getters y setters.  En el constructor vacío se usará el Math.random para generar los dos números. Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar los siguientes métodos:
    Método mostrarValores que muestra cuáles son los dos números guardados.
    Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
    Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.
    Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
*/
package servicio;
import entidad.ParDeNumeros;


public class ParDeNumerosServicio {
    
    public ParDeNumeros crearParDeNumeros(){
        ParDeNumeros PN = new ParDeNumeros();
        return PN;
    }
    
    public void mostrarValores(ParDeNumeros pn){
        System.out.println("numero 1: " + pn.getNumero1());
        System.out.println("numero 2: " + pn.getNumero2());
    }
    
    public double devolverMayor(ParDeNumeros pn){
        return Math.max(pn.getNumero1(), pn.getNumero2());
    }
    
    public double devolverMenor (ParDeNumeros pn){
        return Math.min(pn.getNumero1(), pn.getNumero2());
    }
    
    public void calcularPotencia(ParDeNumeros pn, double mayor, double menor){
        System.out.println("La potencia de " + Math.round(mayor) + " es " + Math.pow(Math.round(mayor), Math.round(menor)));
    }
    
    public void calcularRaiz(ParDeNumeros pn, double menor){
        System.out.println("La raiz cuadrada de " + menor + " es: " + Math.sqrt(Math.round(Math.abs(menor))));
    }
}
