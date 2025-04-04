package com.jaimebackend.primeraweb.service.impl;

import com.jaimebackend.primeraweb.entities.Persona;
import com.jaimebackend.primeraweb.repository.PersonaRepository;
import com.jaimebackend.primeraweb.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonaServiceImpl implements PersonaService {
@Autowired
private PersonaRepository personaRepository;


    @Override
    public List<Persona> obtenerTodas() {
        return personaRepository.findAll();
    }

    @Override
    public Persona obtenerPorId(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public Persona crearPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona actualizarPersona(Long id, Persona persona) {
       Persona PersonaBBDD = personaRepository.findById(id).orElse(null);
       if(PersonaBBDD != null){
          PersonaBBDD.setNombre(persona.getNombre());
          PersonaBBDD.setEdad(persona.getEdad());
          return personaRepository.save(PersonaBBDD);
       }
       return null;
    }

    @Override
    public void eliminarPersona(Long id) {

        personaRepository.deleteById(id);
    }

    @Override
    public long contarPersonas() {
        return personaRepository.count();
    }


}
