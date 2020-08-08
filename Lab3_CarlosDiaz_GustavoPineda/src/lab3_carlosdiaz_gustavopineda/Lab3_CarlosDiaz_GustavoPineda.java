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
        
        ArrayList<Piso> pisos = new ArrayList();
        ArrayList<Persona> personas = new ArrayList();
        ArrayList<Integer> ids = new ArrayList();
        ArrayList<Prueba> pruebas = new ArrayList();
        
        
        boolean seguir = false; String u; String c;     //u: usuario y c: contraseña
        int opcion = 0;                                 //dependiendo de esta, voy a ver el menù de superusuario o el de un usuario normal
        while(seguir==false){
            System.out.println("REGISTRO");
            System.out.println("1. Ingresar como Administrador");
            System.out.println("2. Ingresar como Mortal");
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
        System.out.println("Ingresado con éxito");
        System.out.println("");
        
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
                        System.out.print("Nombre del administrador: ");
                        String admin = leer.next();
                        System.out.print("¿Cuántos evaluadores hay?: ");
                        int c = leer.nextInt();
                        System.out.print("Posición (del ArrayList) del evaluador: ");
                        String evaluador = leer.next();
                    } break;
                    case 2: {
                        
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
                        if(p==1){                   //PERSONA NORMAL
                            pNormal normal = new pNormal();
                            normal.setNombre(nombre); normal.setPosicion(pos); normal.setId(c_id);
                            
                            System.out.println("¿En cuántas pruebas ha participado?");
                            int cant = leer.nextInt();
                            for (int i = 0; i <= cant; i++) {
                                System.out.println("Posición de la prueba (en el ArrayList): ");
                                int po = leer.nextInt();
                                normal.getPruebas().add(pruebas.get(po));
                            }
                            
                            System.out.print("Descripción de porqué querés escalar la torre: ");
                            String desc = leer.next();
                            normal.setDesc(desc);
                            
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
                                normal.setEstado(r);
                            } else{
                                Irregular i = new Irregular();
                                normal.setEstado(i);
                            }
                            
                            personas.add(normal);
                            
                        } else{                 //PERSONA RANKER
                            pRanker ranker = new pRanker();
                            ranker.setNombre(nombre); ranker.setPosicion(pos); ranker.setId(c_id);
                            
                            System.out.println("¿En cuántas pruebas has sido evaluador?");
                            int cant = leer.nextInt();
                            for (int i = 0; i <= cant; i++) {
                                System.out.println("Posición de la prueba (en el ArrayList): ");
                                int po = leer.nextInt();
                                ranker.getLista().add(pruebas.get(po));
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
                                ranker.setEstado(r);
                            } else{
                                Irregular i = new Irregular();
                                ranker.setEstado(i);
                            }
                            
                            personas.add(ranker);
                            
                        }
                        
                        System.out.println("");
                        System.out.print("Tu identificación será: P"+c_id);     //enrealidad solo es el número, la P es de persona
                        System.out.println("");
                        c_id++; ids.add(c_id);

                    } break;
                    case 3: {
                        Prueba prue = new Prueba();
                        System.out.print("Nombre: ");
                        nombre = leer.next();
                        System.out.print("Posición del ranker que será evaluador:");
                        int posranker = leer.nextInt();
                        Persona evaluador = personas.get(posranker);
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
                        prue.setNombre(nombre); prue.setEvaluador((pRanker) evaluador);
                        pruebas.add(prue);
                    } break;
                    case 4: {
                        for (Prueba p : pruebas) {
                            System.out.println(p);
                        }
                    }
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
