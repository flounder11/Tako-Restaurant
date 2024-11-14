package ru.fodi.Tako.Restaurant;

import jakarta.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EntityScan(basePackages = { "ru.fodi.Tako.Restaurant.model" })
@ComponentScan(basePackages = {"ru.fodi.Tako.Restaurant.dal"})

public class TakoRestaurantApplication {
	public static ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(TakoRestaurantApplication.class, args);


	}}