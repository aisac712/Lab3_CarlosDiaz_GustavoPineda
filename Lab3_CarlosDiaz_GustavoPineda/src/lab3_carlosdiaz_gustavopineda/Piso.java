package lab3_carlosdiaz_gustavopineda;

import java.util.ArrayList;

public class Piso {
    private String admin;
    private ArrayList<Persona> evaluadores = new ArrayList();     //no solamente puede ser uno so, es un arraylsit
    private Persona director;
    private ArrayList<Persona> personas = new ArrayList();

    public Piso() {
    }

    public Piso(String admin, ArrayList<Persona> evaluadores, Persona director, ArrayList<Persona> personas) {
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

    public ArrayList<Persona> getEvaluadores() {
        return evaluadores;
    }

    public void setEvaluadores(ArrayList<Persona> evaluadores) {
        this.evaluadores = evaluadores;
    }

    public Persona getDirector() {
        return director;
    }

    public void setDirector(Persona director) {
        this.director = director;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }
    
}
