package lab3_carlosdiaz_gustavopineda;

import java.util.ArrayList;

public class PInferior extends Piso{
    private int nivel;

    public PInferior() {
    }

    public PInferior(int nivel) {
        this.nivel = nivel;
    }

    public PInferior(int nivel, String admin, ArrayList<Persona> evaluadores, Persona director, ArrayList<Persona> personas) {
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
