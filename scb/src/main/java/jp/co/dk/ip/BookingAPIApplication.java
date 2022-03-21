package jp.co.dk.ip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * . system application main file
 */
@SpringBootApplication
@EnableScheduling
public class BookingAPIApplication {

	public static void main(String[] args) {

		System.setProperty("spring.devtools.restart.enabled", "false");
		SpringApplication.run(BookingAPIApplication.class, args);
	}
}
