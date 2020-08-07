package lab3_carlosdiaz_gustavopineda;

public class ERegistro {
    private int estado;        //1: regular       2: irregular

    public ERegistro() {
    }

    public ERegistro(int estado) {
        this.estado = estado;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
}
