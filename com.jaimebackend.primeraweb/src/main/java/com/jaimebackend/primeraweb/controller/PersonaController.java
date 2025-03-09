package com.jaimebackend.primeraweb.controller;

import org.springframework.ui.Model;
import com.jaimebackend.primeraweb.entities.Persona;
import com.jaimebackend.primeraweb.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    public String guardarNuevaPersona(@ModelAttribute Persona persona){
        personaService.crearPersona(persona);
        return "redirect:/personas";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarPersona(@PathVariable Long id, Model model) {
        Persona persona = personaService.obtenerPorId(id);
        if (persona == null) {
            return "redirect:/personas"; // Evita errores si no se encuentra la persona
        }
        model.addAttribute("persona", persona);
        model.addAttribute("accion", "/personas/editar/" + id);
        return "formulario";
    }

    @PostMapping ("/editar/{id}")
    public String actualizarPersonas(@PathVariable Long id, @ModelAttribute Persona persona){
        personaService.actualizarPersona(id,persona);
        return "redirect:/personas";

    }
    @GetMapping("/eliminar/{id}")
    public String eliminarPersona(@PathVariable Long id){
        personaService.eliminarPersona(id);
        return "redirect:/personas";
    }


}