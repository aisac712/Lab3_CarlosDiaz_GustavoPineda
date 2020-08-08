package lab3_carlosdiaz_gustavopineda;

import java.util.ArrayList;

public class Piso {
    private String admin;
    private ArrayList<pRanker> evaluadores;     //no solamente puede ser uno so, es un arraylsit
    private pRanker director;
    private ArrayList<Persona> personas;

    public Piso() {
    }

    public Piso(String admin, ArrayList<pRanker> evaluadores, pRanker director, ArrayList<Persona> personas) {
        this.admin = admin;
        this.evaluadores = evaluadores;
        this.director = director;
        this.personas = personas;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public ArrayList<pRanker> getEvaluadores() {
        return evaluadores;
    }

    public void setEvaluadores(ArrayList<pRanker> evaluadores) {
        this.evaluadores = evaluadores;
    }

    public pRanker getDirector() {
        return director;
    }

    public void setDirector(pRanker director) {
        this.director = director;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }
    
}
