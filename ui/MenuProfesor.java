package ui;
import model.Alumno;
import model.Profesor;
import java.util.ArrayList;
import java.util.Scanner;
import static ui.UiMenu.alumnos;
public class MenuProfesor {
    public static Alumno alumnocopiado;
    public static Alumno alumnonotas;
    public static void mostrarMenuProfesor(){
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

    public static void CursoAlumnos(String cursoBuscado){
        String  respuestaAlumno = "";
        for (Alumno a : alumnos) {   //se recorre toda la lista de alumnos
            if (a.getCurso().equals(cursoBuscado)) { //hasta hayar la que de igualdad de curso
                alumnocopiado = a;
                System.out.println(MenuProfesor.alumnocopiado.nombres);
            }
        }
        System.out.println("Escriba los nombres del estudiante para ver sus notas");
        Scanner sc = new Scanner(System.in);
        respuestaAlumno = String.valueOf(sc.nextLine());
        for (Alumno a : alumnos) {
            if (a.nombres.equals(respuestaAlumno)) { //hayar nombre del estudiante para imprimir notas
                alumnonotas = a;
                Alumno.mostrarNotasAlumno();
            }
        }
    }
}
