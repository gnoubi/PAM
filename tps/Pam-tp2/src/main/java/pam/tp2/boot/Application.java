package pam.tp2.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(scanBasePackages={"pam.tp1","pam.tp2"})
@ImportResource(value = "classpath:spring/application-config.xml")
public class Application {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
		
	}
}
 