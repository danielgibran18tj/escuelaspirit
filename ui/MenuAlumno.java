package ui;

import java.util.Scanner;

public class MenuAlumno {
    public static void mostrarMenuAlumno(){
        int respuestaAlumno = 0;
        System.out.println("Bienvenido alumno " + UiMenu.alumnoLogueado.nombres +
                " del curso " + UiMenu.alumnoLogueado.getCurso());
        do{
            System.out.println("Ingresa nombre de la materia que quieres revisar:\n1. matematicas" +
                    "\n2. ciencias naturales\n3. estudios sociales\n4. ingles\n5. informatica\n0. Salir");
            Scanner sc = new Scanner(System.in);
            respuestaAlumno = Integer.valueOf(sc.nextLine());
            if (respuestaAlumno==1){
                System.out.println("Matematicas: " + UiMenu.alumnoLogueado.matematicas);
            } else if (respuestaAlumno==2) {
                System.out.println("Ciencias Naturales: " + UiMenu.alumnoLogueado.ciencias_naturales);
            } else if (respuestaAlumno==3) {
                System.out.println("Estudios Sociales: " + UiMenu.alumnoLogueado.estudios_sociales);
            }else if (respuestaAlumno==4) {
                System.out.println("Ingles: " + UiMenu.alumnoLogueado.ingles);
            }else if (respuestaAlumno==5) {
                System.out.println("Informatica: " + UiMenu.alumnoLogueado.informatica);
            }
        }while (respuestaAlumno !=0);
    }
}
