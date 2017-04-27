package evolution.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import evolution.bean.Teacher;

@Configuration
@PropertySource("classpath:anyFolder/alphaProperties.properties")// Specifies the properties file location.
@ConfigurationProperties("school")// Reads properties files with "school" prefixes.
public class AlphaConfiguration {
	private Teacher teacher = new Teacher();// Able to read properties like teacher.name and teacher.gender.
	
	public Teacher getTeacher() {
		return teacher;
	}
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	@Bean
	public Teacher teacher() {
		return this.teacher;
	}
}
