package com.example.manejo_formulariosth.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;


public class User {

    @Size (min = 3, max=50)
    private String Nombre;
    @NotBlank
    @Email(message = "ingrese el correo en formato email")
    private String Email;
    @NotBlank
    private String Password;
    @Size(max=100)
    private String Nota;
    @NotBlank
    private String Genero;
    @AssertTrue
    private boolean Matrimonio;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date Fechanacimiento;
    @Min(value=20000)
    @Max(value= 200000)
    private Long Ingreso;

    @NotBlank
    private String Profesion;
    public User() {
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getNota() {
        return Nota;
    }

    public void setNota(String nota) {
        Nota = nota;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public boolean isMatrimonio() {
        return Matrimonio;
    }

    public void setMatrimonio(boolean matrimonio) {
        Matrimonio = matrimonio;
    }

    public Date getFechanacimiento() {
        return Fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        Fechanacimiento = fechanacimiento;
    }

    public Long getIngreso() {
        return Ingreso;
    }

    public void setIngreso(Long ingreso) {
        Ingreso = ingreso;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String profesion) {
        Profesion = profesion;
    }

    public User(String nombre, String email, String password, String nota, String genero, boolean matrimonio, Date fechanacimiento, Long ingreso, String profesion) {
        Nombre = nombre;
        Email = email;
        Password = password;
        Nota = nota;
        Genero = genero;
        Matrimonio = matrimonio;
        Fechanacimiento = fechanacimiento;
        Ingreso = ingreso;
        Profesion = profesion;
    }


    @Override
    public String toString() {
        return "User{" +
                "Nombre='" + Nombre + '\'' +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                ", Nota='" + Nota + '\'' +
                ", Genero='" + Genero + '\'' +
                ", Matrimonio=" + Matrimonio +
                ", Fechanacimiento=" + Fechanacimiento +
                ", Ingreso=" + Ingreso +
                ", Profesion='" + Profesion + '\'' +
                '}';
    }

}
