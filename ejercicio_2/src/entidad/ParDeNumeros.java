/*
    Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales con los cuales se realizarán diferentes operaciones matemáticas. La clase debe tener un constructor vacío, getters y setters.  En el constructor vacío se usará el Math.random para generar los dos números. Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar los siguientes métodos:
    Método mostrarValores que muestra cuáles son los dos números guardados.
    Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
    Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.
    Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
*/
package entidad;

public class ParDeNumeros {
    //Atributos
    private double numero1;
    private double numero2;
    
    //Constructor
    public ParDeNumeros() {
        setNumero1(Math.random() * 10);
        setNumero2(Math.random() * 10);
    }
    
    //Métodos

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    
}
