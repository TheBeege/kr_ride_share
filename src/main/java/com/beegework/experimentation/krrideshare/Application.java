package com.beegework.experimentation.krrideshare;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by thebeege on 11/2/16.
 */
@SpringBootApplication
//@EnableJpaRepositories("com.beegework.experimentation.krrideshare.model")
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /*@Bean
    public CommandLineRunner demo(UserRepository repository) {
        return (args) -> {
            // save a couple of customers
            repository.save(new User("Jack", "Bauer", "rofl.com"));
            repository.save(new User("Chloe", "O'Brian", "rofl.com"));
            repository.save(new User("Kim", "Bauer", "rofl.com"));
            repository.save(new User("David", "Palmer", "rofl.com"));
            repository.save(new User("Michelle", "Dessler", "rofl.com"));

            // fetch all customers
            log.info("Users found with findAll():");
            log.info("-------------------------------");
            for (User user : repository.findAll()) {
                log.info(user.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            User user = repository.findOne(1L);
            log.info("User found with findByID(1L):");
            log.info("--------------------------------");
            log.info(user.toString());
            log.info("");

            // fetch customers by last name
            log.info("User found with findByFamilyName('Bauer'):");
            log.info("--------------------------------------------");
            for (User bauer : repository.findByFamilyName("Bauer")) {
                log.info(bauer.toString());
            }
            log.info("");
        };
    }*/
}
