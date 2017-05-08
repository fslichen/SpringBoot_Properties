package evolution.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import evolution.bean.BetaBean;

@Configuration
@PropertySources({// You are allowed to combine properties from multiple properties files.
	@PropertySource("classpath:betaConfig/betaProperties0.properties"),// And also keep in mind that properties should not be duplicate.
	@PropertySource("classpath:betaConfig/betaProperties1.properties")
})
public class BetaConfiguration {
	@Value("${eyecolor}")
	private String eyeColor;
	
	@Value("${skincolor}")
	private String skinColor;
	
	@Bean
	public BetaBean betaBean() {
		BetaBean betaBean = new BetaBean();
		betaBean.setEyeColor(this.eyeColor);
		betaBean.setSkinColor(this.skinColor);
		return betaBean;
	}
}
