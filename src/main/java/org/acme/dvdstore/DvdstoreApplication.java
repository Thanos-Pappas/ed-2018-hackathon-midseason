package org.acme.dvdstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({"classpath:structure.properties"})
public class DvdstoreApplication {

	public static void main(final String[] args) {
		SpringApplication.run(DvdstoreApplication.class, args);
	}
}
