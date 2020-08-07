package lab3_carlosdiaz_gustavopineda;

import java.util.ArrayList;

public class pNormal extends Persona{
    private ArrayList<Prueba> pruebas;      //en las que participó
    private String desc;

    public pNormal() {
    }

    public pNormal(ArrayList<Prueba> pruebas, String desc) {
        this.pruebas = pruebas;
        this.desc = desc;
    }
    
    public pNormal(ArrayList<Prueba> pruebas, String desc, String nombre, Posicion posicion, int id, ERegistro estado) {
        super(nombre, posicion, id, estado);
        this.pruebas = pruebas;
        this.desc = desc;
    }

    public ArrayList<Prueba> getPruebas() {
        return pruebas;
    }

    public void setPruebas(ArrayList<Prueba> pruebas) {
        this.pruebas = pruebas;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
}
