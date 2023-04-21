package entidad;
public class Soldado {
    private String nombre;
    private int edad;
    private String sexo;

    public Soldado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad > 18 && edad < 70){
            this.edad = edad;
        }
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        sexo = sexo.toLowerCase();
        if(sexo.equals("h") || sexo.equals("hombre") || sexo.equals("mujer")){
            this.sexo = "hombre";
        }else if(sexo.equals("f") || sexo.equals("mujer")){
            this.sexo = "mujer";
        }
    }
    
    @Override
    public String toString() {
        return "Soldado: nombre: " + nombre.toUpperCase().charAt(0) + nombre.substring(1, nombre.length()) + ", edad: " + edad + ", sexo: " + sexo;
    }
}
