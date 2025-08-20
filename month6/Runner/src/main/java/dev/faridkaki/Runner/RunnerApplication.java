package dev.faridkaki.Runner;


import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dev.faridkaki.Runner.run.Location;
import dev.faridkaki.Runner.run.Run;

@SpringBootApplication
public class RunnerApplication {

	private static final Logger log = LoggerFactory.getLogger(RunnerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RunnerApplication.class, args);
		log.info("run successfully");
	}

	@Bean 
	CommandLineRunner runner()
	{
		return args -> {
			Run run = new Run(1, "My First Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 5, Location.OUTDOOR);
		
			log.info("Run: " + run);
		};
	}

}
