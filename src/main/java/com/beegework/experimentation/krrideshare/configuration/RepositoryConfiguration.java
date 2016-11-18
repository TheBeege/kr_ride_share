package com.beegework.experimentation.krrideshare.configuration;

/**
 * Created by thebeege on 11/18/16.
 */
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.beegework.experimentation.krrideshare.model"})
@EnableJpaRepositories(basePackages = {"com.beegework.experimentation.krrideshare.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}