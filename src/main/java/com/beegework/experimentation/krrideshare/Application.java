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
}
