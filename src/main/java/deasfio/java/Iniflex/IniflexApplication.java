package deasfio.java.Iniflex;

import deasfio.java.Iniflex.Principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IniflexApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(IniflexApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.Executar();
	}
}
