package com.example.demo;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class DemoApplication {




	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		SagaOrchestrator orchestrator = new SagaOrchestrator();
		orchestrator.executeSaga();
 	}

}
