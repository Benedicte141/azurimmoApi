package bts.sio.azurimmo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"bts.sio.azurimmo"})
public class AzurimmoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzurimmoApplication.class, args);
	}

}
