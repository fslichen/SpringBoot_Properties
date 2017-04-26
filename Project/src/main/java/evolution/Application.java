package evolution;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Value("${name}")// Requires application.properties on non-test class path.
	private String name;
	
	@Value("${gender}")
	private String gender;
	
	@Value("${age}")// application.properties can also be located in config folder under non-test class path.
	private int age;
	
	@Value("Champaign")// Directly injects Champaign into address.
	private String address;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args).stop();
	}

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println(this.name + " " + this.gender 
				+ " " + this.age + " " + this.address);
	}
}
