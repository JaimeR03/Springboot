package com.jaimebackend.primeraweb;
import com.jaimebackend.primeraweb.entities.Persona;
import com.jaimebackend.primeraweb.repository.PersonaRepository;
import com.jaimebackend.primeraweb.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;
@SpringBootApplication
public class PrimeraWebSpringbootApplication implements CommandLineRunner {

	@Autowired
	private PersonaService personaService;

	public static void main(String[] args) {
		SpringApplication.run(PrimeraWebSpringbootApplication.class, args);


	}


	@Override
	public void run(String... args) throws Exception {
		personaService.crearPersona(new Persona(5L, "Jose",21));
		personaService.crearPersona(new Persona(6L, "martin",21));
		personaService.crearPersona(new Persona(7L, "pedrito",27));
		personaService.crearPersona(new Persona(8L, "brayan",24));

	//Mostramos el numero de personas
	System.out.println("numero de personas en la tabla:"+ personaService.contarPersonas());

	//mostramos las personas
		List<Persona> personas = personaService.obtenerTodas();
		personas.forEach(persona -> System.out.println("Nombre de la persona "+ persona.getNombre()));

	}
}
