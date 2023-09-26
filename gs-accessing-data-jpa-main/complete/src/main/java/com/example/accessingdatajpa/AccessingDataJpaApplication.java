package com.example.accessingdatajpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.accessingdatajpa.entity.Customer;
import com.example.accessingdatajpa.repository.CustomerRepository;

@SpringBootApplication
public class AccessingDataJpaApplication {

	private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AccessingDataJpaApplication.class);
	}
	/*
	 *  @Bean se utiliza para indicar que un método en una clase
	 *  de Spring, devuelve un objeto que debe ser administrado
	 *  por el contener de Spring.
	 *  
	 *  Cuando se utliza @Bean en un método, Spring se encarga
	 *  de llamar a ese método y registrar el objeto devuelto
	 *  en el contexto de la aplicación como un bran.
	 *  Este bean estará disponible para su inyección de dependencias
	 *  en otras partes de la aplicación.
	 *  
	 *  Command Line Runner es una interfaz funcional proporcionada
	 *  por Spring que define un método run() que se ejeucta una
	 *  vez que se haya iniciado complementamente el
	 *  contexto de la aplicación de Spring. Este método
	 *  se utiliza comunmente para ejecutar tareas de inicialización
	 *  o configuración al inicio de la aplicación.
	 */
	//@Bean
	public CommandLineRunner demo(CustomerRepository repository) {
		return (args) -> {
			// save a few customers
			repository.save(new Customer("Jack", "Bauer"));
			repository.save(new Customer("Chloe", "O'Brian"));
			repository.save(new Customer("Kim", "Bauer"));
			repository.save(new Customer("David", "Palmer"));
			repository.save(new Customer("Michelle", "Dessler"));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Customer customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			Customer customer = repository.findById(1L);
			log.info("Customer found with findById(1L):");
			log.info("--------------------------------");
			log.info(customer.toString());
			log.info("");

			// fetch customers by last name
			log.info("Customer found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			repository.findByLastName("Bauer").forEach(bauer -> {
				log.info(bauer.toString());
			});
			// for (Customer bauer : repository.findByLastName("Bauer")) {
			// 	log.info(bauer.toString());
			// }
			log.info("");
		};
	}

}
