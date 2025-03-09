package com.example.manejo_formulariosth.controller;
import example.model.User;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.*;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/registrar")
    public String mostrarFormulario(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        List<String> listaProfesiones = Arrays.asList("Programador", "Tester", "arquitecto");
        model.addAttribute("profesiones",listaProfesiones);
        return "registrar_form";
    }
    @PostMapping("/registrar")
    public String submitFormulario(@Valid @ModelAttribute User user, BindingResult bindingResult, Model model) {
        System.out.println(user.toString());

        if (bindingResult.hasErrors()) {
            List<String> listaProfesiones = Arrays.asList("Programador", "Tester", "arquitecto");
            model.addAttribute("profesiones", listaProfesiones);
            return "registrar_form";
        } else {
            return "registro_success";
        }
    }

}
