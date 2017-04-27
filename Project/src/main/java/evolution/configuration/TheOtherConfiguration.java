package evolution.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import evolution.bean.TheOtherBean;

@Configuration
@PropertySource("classpath:/anyFolder/theOtherProperties.properties")// Specify the properties file location.
@ConfigurationProperties// Read theOtherProperties.properties and inject the properties into the current class. No @Value is required.
public class TheOtherConfiguration {
	private int salary;// Don't forget the getters and setters.
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Bean
	public TheOtherBean theOtherBean() {
		TheOtherBean theOtherBean = new TheOtherBean();
		theOtherBean.setSalary(this.salary);
		return theOtherBean;
	}
}
