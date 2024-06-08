package com.immorti.zaai;

import com.immorti.zaai.configuration.OllamaPropertiesConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(OllamaPropertiesConfig.class)
public class ZaaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZaaiApplication.class, args);
	}

}
