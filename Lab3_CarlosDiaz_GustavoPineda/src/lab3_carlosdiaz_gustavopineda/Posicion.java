package lab3_carlosdiaz_gustavopineda;

public class Posicion {
    private String tarea;       //las de pescador, manipulador de ondas...

    public Posicion() {
    }

    public Posicion(String tarea) {
        this.tarea = tarea;
    }

    @Override
    public String toString() {
        return tarea;
    }
    
}
