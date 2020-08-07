package lab3_carlosdiaz_gustavopineda;

public class Persona {
    private String nombre;
    private Posicion posicion;
    private String id;
    private ERegistro estado;

    public Persona() {
    }

    public Persona(String nombre, Posicion posicion, String id, ERegistro estado) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.id = id;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ERegistro getEstado() {
        return estado;
    }

    public void setEstado(ERegistro estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", posicion=" + posicion + ", id=" + id + ", estado=" + estado + '}';
    }
    
}
