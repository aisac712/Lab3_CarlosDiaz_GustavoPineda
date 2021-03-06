package lab3_carlosdiaz_gustavopineda;

import java.util.ArrayList;

public class Prueba {
    private String nombre;
    private Persona evaluador;
    private ArrayList<Persona> equipo = new ArrayList();
    private String estado;                      //1aprobado o desaprobado

    public Prueba() {
    }

    public Prueba(String nombre, Persona evaluador, ArrayList<Persona> equipo, String estado) {
        this.nombre = nombre;
        this.evaluador = evaluador;
        this.equipo = equipo;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona getEvaluador() {
        return evaluador;
    }

    public void setEvaluador(Persona evaluador) {
        this.evaluador = evaluador;
    }

    public ArrayList<Persona> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<Persona> equipo) {
        this.equipo = equipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        String salida = "";
        salida += "Informe de prueba: "+nombre+"\n";
        salida += "Evaluador: "+evaluador+"\n";
        salida += "Equipo:"+"\n";
        for (int i = 0; i < equipo.size(); i++) {
            salida += "+"+equipo.get(i)+"\n";
        }
        salida += "Estado: "+estado+"\n";
        //return "Prueba{" + "nombre=" + nombre + ", evaluador=" + evaluador + ", equipo=" + equipo + ", estado=" + estado + '}';
        return salida;
    }
    
}
