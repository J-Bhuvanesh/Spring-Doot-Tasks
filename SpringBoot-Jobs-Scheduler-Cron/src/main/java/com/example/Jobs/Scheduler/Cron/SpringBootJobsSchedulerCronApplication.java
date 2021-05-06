package com.example.Jobs.Scheduler.Cron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootJobsSchedulerCronApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJobsSchedulerCronApplication.class, args);
	}

}
