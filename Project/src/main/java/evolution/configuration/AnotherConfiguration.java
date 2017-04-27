package evolution.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import evolution.bean.AnotherBean;

@Configuration
@PropertySource("classpath:anyFolder/anotherProperties.properties")// Search for anotherProperties.properties under anyFolder.
public class AnotherConfiguration {
	@Value("${birthday}")
	private String birthday;
	
	@Bean
	public AnotherBean anotherBean() {
		AnotherBean anotherBean = new AnotherBean();
		anotherBean.setBirthday(this.birthday);
		return anotherBean;
	}
}
