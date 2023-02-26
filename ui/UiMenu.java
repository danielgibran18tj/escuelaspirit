package ui;

import model.Alumno;
import model.Profesor;
import model.Representante;
import model.User;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class UiMenu {
    public static ArrayList<Profesor> profesores = new ArrayList<>();
    public static ArrayList<Alumno> alumnos = new ArrayList<>();
    public static Profesor profesorLogueado;
    public static Alumno alumnoLogueado;
    public static Representante representanteLogueado;
    public static void mostrarmenu() {
        System.out.println("Selecciona la opcion deseada");
        String respuesta = "";
        do {
            System.out.println("1. Profesor");
            System.out.println("2. Alumno");
            System.out.println("3. Curso");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            respuesta = sc.nextLine();

            switch (respuesta) {
                case "1":
                    System.out.println("Ingresaste Profesor");
                    System.out.println("Inserta your email: ej@gmail.com");
                    //respuesta = 0;
                    tipoUsuarioAutenticacion(1); // mostrar menu de profesor
                    break;
                case "2":
                    System.out.println("Ingresaste Alumno");
                    System.out.println("Inserta your email: ej@gmail.com");
                    //respuesta = 0;
                    tipoUsuarioAutenticacion(2); // mostrar menu de alumno
                    break;
                case "3":
                    System.out.println("Ingresaste Curso");
                    //respuesta = 0;
                    tipoUsuarioAutenticacion(3); // mostrar menu de cursos
                    break;
                case "0":
                    System.out.println("Gracias por tu visita... No vuelvas");
                    break;
                default:
                    System.out.println("no sabes leer??? ingresa la opcion correcta");
            }
        } while (respuesta != "0");
    }

    public static void tipoUsuarioAutenticacion(int tipoUsuario){
        //DATOS DE PROFESORES
            profesores.add(new Profesor("alejandro martinez", "alejandro@gmail.com", "ingeniero"));
            profesores.add(new Profesor("Karen sosa", "karen@gmail.com", "doctora"));
            profesores.add(new Profesor("daniel Hinost","daniel@gmail.com","desarrollador"));

        //ALUMNOS DE QUINTO CURSO CON SUS RESPECTIVAS NOTAS  : MATEMATICAS , CIENCIAS NAT , ESTUDIOS SOC, INGLES, INFORMATICA
            alumnos.add(new Alumno("juanito salgado", "juanito@gmail.com","quinto", Arrays.asList(9.6, 4.3), Arrays.asList(8.2,7.0),Arrays.asList(8.7,6.5),Arrays.asList(6.8,8.5),Arrays.asList(8.5,5.4)));
            alumnos.add(new Alumno("pepito rodrigues", "pepito@gmail.com", "quinto",Arrays.asList(7.6,6.7), Arrays.asList(8.9,8.6),Arrays.asList(9.,7.),Arrays.asList(5.0,6.5),Arrays.asList(6.7,9.5)));
            alumnos.add(new Alumno("carlitos sanchez", "carlitos@gmail.com","quinto",Arrays.asList(7.8,8.6), Arrays.asList(9.7,9.9),Arrays.asList(10.,9.6),Arrays.asList(8.6,9.2),Arrays.asList(9.7,8.9)));
        //ALUMNOS DE SEXTO CURSO CON SUS RESPECTIVAS NOTAS
            alumnos.add(new Alumno("oliver aton", "oliver@gmail.com","sexto", Arrays.asList(4.6,3.9), Arrays.asList(8.9,6.9),Arrays.asList(7.6,4.7),Arrays.asList(7.4,8.5),Arrays.asList(8.7,6.8)));
            alumnos.add(new Alumno("goku kakaroto", "goku@gmail.com", "sexto",Arrays.asList(5.6,7.6), Arrays.asList(8.,7.6),Arrays.asList(8.6,5.7),Arrays.asList(8.7,5.8),Arrays.asList(8.7,5.6)));
            alumnos.add(new Alumno("bulma saiyayin", "bulma@gmail.com","sexto",Arrays.asList(6.7,8.5), Arrays.asList(8.7,5.8),Arrays.asList(9.6,5.6),Arrays.asList(6.7,4.5),Arrays.asList(7.6,5.4)));
        //ALUMNOS DE SEPTIMO CURSO CON SUS RESPECTIVAS NOTAS
            alumnos.add(new Alumno("gato perez", "gato@gmail.com","septimo", Arrays.asList(6.5,7.8), Arrays.asList(7.6,5.7),Arrays.asList(7.8,5.6),Arrays.asList(8.7,6.5),Arrays.asList(7.6,5.8)));
            alumnos.add(new Alumno("novita doraemon", "novita@gmail.com", "septimo",Arrays.asList(7.8,5.9), Arrays.asList(7.8,5.8),Arrays.asList(5.7,9.7),Arrays.asList(6.7,8.6),Arrays.asList(8.7,7.8)));
            alumnos.add(new Alumno("pajaro loco", "pajaro@gmail.com","septimo",Arrays.asList(8.6,9.5), Arrays.asList(9.7,9.9),Arrays.asList(4.8,6.8),Arrays.asList(6.9,8.7),Arrays.asList(8.9,8.6)));
        //DATOS DE REPRESENTANTES
        ArrayList<Representante> representantes = new ArrayList<>();
            representantes.add(new Representante("Juan salgado", "juan@gmail.com"));
            representantes.add(new Representante("Pepe rodrigues", "pepe@gmail.com"));
            representantes.add(new Representante("Carlos sanchez", "carlos@gmail.com"));

        boolean emailCorrecto = false;
        Scanner sc = new Scanner(System.in);
            do {
                if (tipoUsuario == 1) {     //userType == 1 => profesor
                    String email = sc.nextLine();
                    for (Profesor p : profesores) {   //se recorre toda la lista de profesores
                        if (p.getEmail().equals(email)) { //hasta hayar la que de igualdad de email
                            emailCorrecto = true;
                            //obtener valores de usuario logeado
                            profesorLogueado = p;
                            //showDoctorMenu
                            System.out.println("Bienvenido profesor " + UiMenu.profesorLogueado.nombres);
                            MenuProfesor.mostrarMenuProfesor();
                        }
                    }
                } else if (tipoUsuario == 2) {      //userType == 2 => Alumno
                    String email = sc.nextLine();
                    for (Alumno a : alumnos) {   //se recorre toda la lista de alumnos
                        if (a.getEmail().equals(email)) { //hasta hayar la que de igualdad de email
                            emailCorrecto = true;
                            //obtener valores de usuario logeado
                            alumnoLogueado = a;
                            MenuAlumno.mostrarMenuAlumno();
                        }
                    }
                } else if (tipoUsuario == 3) {//userType == 3 => Curso
                    emailCorrecto = true;
                    MenuProfesor.mostrarMenuProfesor();
                }
            }while (!emailCorrecto) ;
    }
}
