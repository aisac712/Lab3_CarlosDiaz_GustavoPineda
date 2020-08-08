package lab3_carlosdiaz_gustavopineda;

import java.util.ArrayList;

public class pRanker extends Persona{
    private ArrayList<Prueba> lista = new ArrayList();        //listas en las que fue evaluador

    public pRanker() {
    }

    public pRanker(ArrayList<Prueba> lista, String nombre, Posicion posicion, int id, ERegistro estado) {
        super(nombre, posicion, id, estado);
        this.lista = lista;
    }

    public pRanker(ArrayList<Prueba> lista) {
        this.lista = lista;
    }

    public ArrayList<Prueba> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Prueba> lista) {
        this.lista = lista;
    }
    
}
