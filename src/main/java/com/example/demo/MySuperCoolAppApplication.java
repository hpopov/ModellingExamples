package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import ua.cmathtutor.startledfrog.repository.RepositoryFactoryBean;

@SpringBootApplication
@EnableJpaRepositories(repositoryFactoryBeanClass = RepositoryFactoryBean.class)
public class MySuperCoolAppApplication {

    public static void main(String[] args) {
	SpringApplication.run(MySuperCoolAppApplication.class, args);
    }

}
