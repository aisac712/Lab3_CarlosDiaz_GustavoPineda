package lab3_carlosdiaz_gustavopineda;

import java.util.ArrayList;

public class PSuperior extends Piso{
    private int nivel;

    public PSuperior() {
    }
    
    public PSuperior(int nivel) {
        this.nivel = nivel;
    }

    public PSuperior(int nivel, String admin, ArrayList<Persona> evaluadores, Persona director, ArrayList<Persona> personas) {
        super(admin, evaluadores, director, personas);
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
}
