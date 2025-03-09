package com.jaimebackend.formulariosthymeleaf.model;

import jakarta.validation.constraints.*;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;



public class User {

    @Size(min = 3, max = 50)
    private String nombre;

    @NotBlank
    @Email(message = "Ingrese el correo en formarto email")
    private String email;

    @NotBlank
    @Size(min = 5, max = 15)
    private String password;

    @NotBlank
    private String genero;

    @Size(min = 5, max = 100)
    private String nota;

    @AssertTrue
    private boolean matrimonio;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date fechaNacimiento;

    @NotBlank
    private String profesion;

    @Min(value = 20000)
    @Max(value = 200000)
    private long ingreso;

    public User(String nombre, String email, String password, String genero, String nota, boolean matrimonio, Date fechaNacimiento, String profesion, long ingreso) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.genero = genero;
        this.nota = nota;
        this.matrimonio = matrimonio;
        this.fechaNacimiento = fechaNacimiento;
        this.profesion = profesion;
        this.ingreso = ingreso;
    }

    public User() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public boolean isMatrimonio() {
        return matrimonio;
    }

    public void setMatrimonio(boolean matrimonio) {
        this.matrimonio = matrimonio;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public long getIngreso() {
        return ingreso;
    }

    public void setIngreso(long ingreso) {
        this.ingreso = ingreso;
    }

    @Override
    public String toString() {
        return "User{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", genero='" + genero + '\'' +
                ", nota='" + nota + '\'' +
                ", matrimonio=" + matrimonio +
                ", fechaNacimiento=" + fechaNacimiento +
                ", profesion='" + profesion + '\'' +
                ", ingreso=" + ingreso +
                '}';
    }
}
