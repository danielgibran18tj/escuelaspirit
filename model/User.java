package model;

public abstract class User {
    int id;
    public String nombres;
    private String email;
    private String direccion;
    private String numeroCelular;

    public User(String nombres, String email) {
        this.nombres = nombres;
        this.email = email;
    }
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    /*public String getNombres() {return nombres;}

    public void setNombres(String nombres) {this.nombres = nombres;}*/

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getDireccion() {return direccion;}

    public void setDireccion(String direccion) {this.direccion = direccion;}

    public String getNumeroCelular() {return numeroCelular;}

    public void setNumeroCelular(String numeroCelular) {
        if (numeroCelular.length() != 10){
            System.out.println("ingresa numero de 10 digitos");
        } else if (numeroCelular.length() ==10) {
            this.numeroCelular = numeroCelular;
        }
    }
}
