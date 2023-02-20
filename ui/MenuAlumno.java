package ui;

import java.util.Scanner;

public class MenuAlumno {
    public static void mostrarMenuAlumno(){
        int respuestaAlumno = 0;
        System.out.println("Bienvenido alumno " + UiMenu.alumnoLogueado.nombres +
                " del curso " + UiMenu.alumnoLogueado.getCurso());
        do{
            System.out.println("Ingresa numero de la materia que quieres revisar:\n1. matematicas" +
                    "\n2. ciencias naturales\n3. estudios sociales\n4. ingles\n5. informatica\n0. Salir");
            Scanner sc = new Scanner(System.in);
            respuestaAlumno = Integer.valueOf(sc.nextLine());
            if (respuestaAlumno==1){
                System.out.println("Matematicas: " + UiMenu.alumnoLogueado.matematicas+"\n");
            } else if (respuestaAlumno==2) {
                System.out.println("Ciencias Naturales: " + UiMenu.alumnoLogueado.ciencias_naturales+"\n");
            } else if (respuestaAlumno==3) {
                System.out.println("Estudios Sociales: " + UiMenu.alumnoLogueado.estudios_sociales+"\n");
            }else if (respuestaAlumno==4) {
                System.out.println("Ingles: " + UiMenu.alumnoLogueado.ingles+"\n");
            }else if (respuestaAlumno==5) {
                System.out.println("Informatica: " + UiMenu.alumnoLogueado.informatica+"\n");
            }
        }while (respuestaAlumno !=0);
    }
}
