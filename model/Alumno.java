package model;

import ui.MenuProfesor;
import ui.UiMenu;

import java.util.ArrayList;
import java.util.List;

public class Alumno extends User{
    //private ArrayList<String> materias = new ArrayList<>();
    private String curso;
    private String seccion;
    public List<Double> matematicas = new ArrayList<>();
    public List<Double> ciencias_naturales = new ArrayList<>();
    public List<Double> estudios_sociales = new ArrayList<>();
    public List<Double> ingles = new ArrayList<>();
    public List<Double> informatica = new ArrayList<>();

    public Alumno(String nombres, String email, String curso, List<Double> matematicas,
                  List<Double> ciencias_naturales, List<Double> estudios_sociales,
                  List<Double> ingles, List<Double> informatica) {
        super(nombres, email);
        this.curso = curso;
        this.matematicas = matematicas;
        this.ciencias_naturales = ciencias_naturales;
        this.estudios_sociales = estudios_sociales;
        this.ingles = ingles;
        this.informatica = informatica;
    }

    public static void mostrarNotasAlumno(){
        System.out.println("El alumno "+MenuProfesor.alumnonotas.nombres+" del curso " +
                MenuProfesor.alumnonotas.getCurso()+" \nTiene las siguientes notas:");
        System.out.println("Matematicas: " + MenuProfesor.alumnonotas.matematicas);
        System.out.println("Ciencias Naturales: " + MenuProfesor.alumnonotas.ciencias_naturales);
        System.out.println("Estudios Sociales: " + MenuProfesor.alumnonotas.estudios_sociales);
        System.out.println("Ingles: " + MenuProfesor.alumnonotas.ingles);
        System.out.println("Informatica: " + MenuProfesor.alumnonotas.informatica);
    }
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }


}
