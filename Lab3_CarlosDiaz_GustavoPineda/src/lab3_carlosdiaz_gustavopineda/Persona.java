package lab3_carlosdiaz_gustavopineda;

public class Persona {
    private String nombre;
    private Posicion posicion;
    private int id;
    private ERegistro estado;

    public Persona() {
    }

    public Persona(String nombre, Posicion posicion, int id, ERegistro estado) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ERegistro getEstado() {
        return estado;
    }

    public void setEstado(ERegistro estado) {
        this.estado = estado;
    }

    public String imprimirPersona() {
        return "Persona{" + "Identificación=" + id + ", nombre=" + nombre + ", estado de registro=" + estado + ", posición=" + posicion + '}'+"\n";
    }

    @Override
    public String toString() {
        return nombre + " - " + posicion;// + ", id=" + id + ", estado=" + estado + '}';
    }
    
}
