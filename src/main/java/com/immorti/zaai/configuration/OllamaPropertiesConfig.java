package com.immorti.zaai.configuration;

import java.util.Map;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;


@Getter
@ConfigurationProperties(prefix = "app")
public class OllamaPropertiesConfig {

    private Map<String, Map<String, String>> ollama;

    public OllamaPropertiesConfig(Map<String, Map<String, String>> ollama) {
        this.ollama = ollama;
    }
}
