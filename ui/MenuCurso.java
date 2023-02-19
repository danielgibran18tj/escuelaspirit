package ui;

import model.Alumno;

import java.util.Scanner;

import static ui.UiMenu.alumnos;

public class MenuCurso {public static Alumno alumnocopiado;
    public static Alumno alumnonotas;
    public static void mostrarMenuCurso(){
        int respuesta = 0;
        do{
            System.out.println("ingrese que curso desea observar: ");
            System.out.println("1. Quinto \n2. Sexto\n3. Septimo\n0. Salir");
            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());
            switch (respuesta){
                case 1:
                    System.out.println("Alumnos de quinto curso:");
                    MenuProfesor.CursoAlumnos("quinto");
                    break;
                case 2:
                    System.out.println("Alumnos de sexto curso:");
                    MenuProfesor.CursoAlumnos("sexto");
                    break;
                case 3:
                    System.out.println("Alumnos de septimo curso:");
                    MenuProfesor.CursoAlumnos("septimo");
                    break;
                default:
                    System.out.println("Seleccion una respuesta correcta");
            }
            System.out.println("Desea salir de su correo?? \n0. Salir\n1. Seguir revisando");
            respuesta = Integer.valueOf(sc.nextLine());
        }while (respuesta !=0);
    }
}
