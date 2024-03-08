package tech.getarrays.employeemanager.filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    WebMvcConfigurer corsConfigure() {
		return new WebMvcConfigurer() {
			public void addCorsMapping(CorsRegistry registry) {
				registry.addMapping("/list/**")
				.allowedOrigins("http://localhost:4200")
				.allowedMethods("*");
			}
			
		};
		
	}

}
