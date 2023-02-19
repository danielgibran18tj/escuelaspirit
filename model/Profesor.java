package model;

import java.util.ArrayList;

public class Profesor extends User{
    private String curso;
    private String seccion;
    private String especialidad;
    public Profesor(String nombres, String email , String especialidad) {
        super(nombres, email);
        this.especialidad = especialidad;
    }
}
