package com.jaimebackend.primeraweb.repository;

import com.jaimebackend.primeraweb.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository//esterotipos
public interface PersonaRepository extends JpaRepository<Persona, Long> {



}
