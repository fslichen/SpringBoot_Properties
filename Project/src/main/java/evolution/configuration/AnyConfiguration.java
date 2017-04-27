package evolution.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import evolution.bean.AnyBean;

@Configuration
@PropertySource("classpath:anyProperties.properties")// Loads self-defined properties file. Spring boot reads application.properties by default.
public class AnyConfiguration {
	@Value("${zipCode}")
	private String zipCode;
	
	@Value("${apartment}")
	private String apartment;
	
	@Bean
	public AnyBean anyBean() {
		AnyBean anyBean = new AnyBean();
		anyBean.setApartment(this.apartment);
		anyBean.setZipCode(this.zipCode);
		return anyBean;
	}
}
