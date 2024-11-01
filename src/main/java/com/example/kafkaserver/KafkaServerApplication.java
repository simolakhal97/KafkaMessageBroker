package com.example.kafkaserver;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.stream.Stream;

@SpringBootApplication
public class KafkaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaServerApplication.class, args);
	}
	@Bean
  CommandLineRunner runner(KafkaTemplate<String ,String > kafkaTemplate){
		return args -> {
			for (int i = 0; i < 100; i++) {
				kafkaTemplate.send("mohammedLakhal", "Hello kafka *😂😂😂😂😂😂🤣🤣😒😒"+i);
			}

		};
  }
}
