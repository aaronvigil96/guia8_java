package entidad;
public class Batallon {
    
    private int numero;
    private Soldado [] batallon;
    
    public Batallon() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Soldado[] getBatallon() {
        return batallon;
    }

    public void setBatallon(Soldado[] batallon) {
        this.batallon = batallon;
    }

    
}
