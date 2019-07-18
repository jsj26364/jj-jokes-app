package software.jsj.jokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JjJokesAppApplication {

  /*
   * Detailed Help (using SpringBoot plugin):
   * mvn spring-boot:help -Ddetail=true
   * 
   * 
   * Spring AutoConfiguration Report:
   * mvn spring-boot:run -Dspring-boot.run.arguments=--debug
   * 
   * 
   * 
   */
	public static void main(String[] args) {
		SpringApplication.run(JjJokesAppApplication.class, args);
	}

}
