package com.tcna.formulariosthymeleaf.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class User {

    @Size(min = 3,max = 50)
    private String nombre;
//jaime
    @NotBlank
    @Email(message = "Ingrese el correo en formarto email")
    private String email;

    @NotBlank
    @Size(min = 5,max = 15)
    private String password;

    @NotBlank
    private String genero;

    @Size(min = 5,max = 100)
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

}
