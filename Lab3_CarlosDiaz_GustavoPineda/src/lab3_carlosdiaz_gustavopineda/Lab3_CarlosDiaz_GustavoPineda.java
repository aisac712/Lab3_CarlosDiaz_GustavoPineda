package lab3_carlosdiaz_gustavopineda;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_CarlosDiaz_GustavoPineda {
    static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        String supeh="SUDO";        String contra = "clau123";       int c_id = 0;       //los id van a ser letra P + número manejado con contador
        
        String nombre;
        String posicion;  String tarea;
        int id;
        ERegistro estado;
        
        ArrayList<Persona> personas = new ArrayList();
        ArrayList<Integer> ids = new ArrayList();
        
        
        boolean seguir = false; String u; String c;     //u: usuario y c: contraseña
        int opcion = 0;                                 //dependiendo de esta, voy a ver el menù de superusuario o el de un usuario normal
        while(seguir==false){
            System.out.println("REGISTRO");
            System.out.print("1. Ingresar como Administrador");
            System.out.print("2. Ingresar como Mortal");
            int r = leer. nextInt();
            if(r==1){
                System.out.print("Superusuario: ");
                u = leer.next();
                System.out.print("Contraseña: ");
                c = leer.next();
                if(u.contains(supeh) && c.contains(contra)){
                    seguir = true;
                    opcion =1;
                }
            } else if (r==2){
                System.out.print("Identificador: P");
                u = leer.next();
                int iden = Integer.parseInt(u);     //es un entero en realidad, pero yo lo pongo
                for (int i = 0; i < ids.size(); i++) {
                    if(iden==ids.get(i)){       //tiene que ser iguales
                        seguir=true;
                        opcion = 2;
                    }
                }
            }
        }
        
        if(opcion==1){
            int op=0;
            while(op!=5){
                System.out.println("1. Agregar piso");
                System.out.println("2. Agregar persona");
                System.out.println("3. Agregar prueba");
                System.out.println("4. Informe de pruebas");
                System.out.print("Ingresa opción: ");
                op = leer.nextInt();
                switch (op) {
                    case 1: {
                        System.out.println("");
                    } break;
                    case 2: {
                        Persona per = new Persona();
                        
                        System.out.print("Ingresa nombre de la persona: ");
                        nombre = leer.next();
                        System.out.print("Rol/Posición de la persona: ");
                        System.out.print("1. Pescador       2. Portador de lanzas       3. Portador de luz      4. Explorador       5. Manipulador de ondas  :");
                        int p = leer.nextInt();
                        while (p<=0 || p>=5) {                                  //validción
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
                        Posicion pos = new Posicion(tarea);     //inicializo
                        
                        System.out.print("Tipo de persona: ");
                        System.out.println("1. Normal       2. Ranker  :");
                        p = leer.nextInt();
                        while (p<=0 || p>=3) {                                  //validción
                            System.out.println("1. Normal       2. Ranker");
                            p = leer.nextInt();
                        }
                        if(p==1){       //normal
                            //pNormal normal = new pNormal();
                        } else{         //ranker
                            
                        }
                        
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
                            r.setUser(user); r.setPw(pw); r.setEstado(e);
                            per.setEstado(r);
                        } else{
                            Irregular i = new Irregular();
                            i.setEstado(e); per.setEstado(i);
                        }
                        
                        
                        
                        per.setNombre(nombre); per.setPosicion(pos);
                        System.out.print("Tu identificación será: P"+c_id);
                        per.setId(c_id); c_id++; ids.add(c_id);
                        personas.add(per);

                    } break;
                    case 3: {
                        Prueba prue = new Prueba();
                        System.out.print("Nombre: ");
                        nombre = leer.next();
                        System.out.print("Posición del ranker que será evaluador:");
                        int posranker = leer.nextInt();
                        personas.get(posranker);
                        System.out.print("¿Cuántas personas formaron el equipo?");
                        int cantidad = leer.nextInt();
                        for (int i = 0; i < cantidad; i++) {
                            System.out.print("Posición de la persona:");
                            int p = leer.nextInt();
                            prue.getEquipo().add(personas.get(p));              //en mi equipo meto las personas con la `posicion dada
                        }
                        System.out.print("Estado de la prueba: ");
                        System.out.print("1. Aprobada       2. Reprobada:   ");
                        int p = leer.nextInt();
                        if(p==1){
                            prue.setEstado("Aprobada");
                        } else if(p==2){
                            prue.setEstado("Reprobada");
                        }
                    } break;
                    default: System.out.println("Opción no válida");
                }
            }
        } else{
            int op=0;
            while(op!=3){
                System.out.println("1. Visualizar pisos y pruebas");
                System.out.println("2. Visualizar personas");
                System.out.println("3. Salir");
                System.out.print("Ingresa opción: ");
                op = leer.nextInt();
                switch (op) {
                    case 1: {
                        
                    } break;
                    case 2: {
                        
                    } break;
                    case 3: {
                        System.out.println("Abandonando la torre");
                    } break;
                    default: System.out.println("Opción no válida");
                }
            }
        }
        
        
    }
    
}
