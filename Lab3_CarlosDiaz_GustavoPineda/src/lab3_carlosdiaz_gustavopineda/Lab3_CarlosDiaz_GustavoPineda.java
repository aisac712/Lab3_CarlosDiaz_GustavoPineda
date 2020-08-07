package lab3_carlosdiaz_gustavopineda;

import java.util.Scanner;

public class Lab3_CarlosDiaz_GustavoPineda {
    static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        String supeh="SUDO";        String conta = "clau123";       int c_id = 0;
        
        String nombre;
        String posicion;  String tarea;
        String id;
        ERegistro estado;
        
        int op=0;
        while(op!=6){
            System.out.println("1. Agregar piso");
            System.out.println("2. Agregar persona");
            System.out.println("3. Agregar prueba");
            
            switch (op) {
                case 1: {
                    System.out.println("");
                } break;
                case 2: {
                    Persona per = new Persona();
                    System.out.print("Ingresa nombre de la persona: ");
                    nombre = leer.next();
                    System.out.print("Rol/Posición de la persona: ");
                    System.out.println("1. Pescador, 2. Portador de lanzas, 3. Portador de luz, Explorador, 4. Manipulador de ondas");
                    int p = leer.nextInt();
                    while (p<=0 || p>=5) {
                        System.out.println("1. Pescador       2. Portador de lanzas       3. Portador de luz      4. Explorador       5. Manipulador de ondas");
                        p = leer.nextInt();
                    }
                    if(p==1){
                        tarea = "Pescador";
                    } else if(p==2){
                        tarea = "Portador de lanzas";
                    } else if(p==3){
                        tarea = "Portador de luz";
                    } else if(p==4){
                        tarea = "Explorador";
                    } else if(p==5){
                        tarea = "Manipulador de ondas";
                    } else{
                        tarea = "Pescador";     //si no sigue instrucciones, le voy a signar una por defecto
                    }
                    Posicion pos = new Posicion(tarea);
                    System.out.print("Estado de registro: ");
                    System.out.println("1. Regular      2. Irregular");
                    int e = leer.nextInt();
                    if(e==1){
                        Regular r = new Regular();
                        String user;
                        String pw;
                        System.out.print("Ingresa tu usuario: ");
                        user = leer.next();
                        System.out.print("Contraseña: ");
                        pw = leer.next();
                        r.setUser(user); r.setPw(pw);
                        per.setEstado(r);
                    } else{
                        Irregular i = new Irregular();
                        per.setEstado(i);
                    }
                    
                    per.setNombre(nombre); per.setPosicion(pos);
                    System.out.print("Tu identificación será: P"+c_id);
                    
                }
                default: System.out.println("Opción no válida");
            }
        }
        
    }
    
}
