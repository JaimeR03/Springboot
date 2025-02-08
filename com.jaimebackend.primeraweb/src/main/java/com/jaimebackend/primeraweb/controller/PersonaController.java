package com.jaimebackend.primeraweb.controller;

import org.springframework.ui.Model;
import com.jaimebackend.primeraweb.entities.Persona;
import com.jaimebackend.primeraweb.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    // la clase model se utiliza para transferir objetos del controller a la vista
    @GetMapping
    public String listarPersonas(Model model){
     List<Persona> personas = personaService.obtenerTodas();
     model.addAttribute("personasLista", personas);
     return "listar";
    }

    @GetMapping("/nueva")
    public String mostrarFormularioDeNuevaPersona(Model model){
      model.addAttribute("persona", new Persona());
      model.addAttribute("accion","/personas/nueva");
        return"formulario";
    }

    @PostMapping("/nueva")
    public String guarsarNuevaPersona(@ModelAttribute Persona persona){
        personaService.crearPersona(persona);
        return "redirect:/personas";
    }
}
