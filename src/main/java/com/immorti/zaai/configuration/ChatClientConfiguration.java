package com.immorti.zaai.configuration;

import java.util.HashMap;
import java.util.Map;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.ollama.api.OllamaApi;
import org.springframework.ai.ollama.api.OllamaOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChatClientConfiguration {

    @Autowired
    private OllamaPropertiesConfig ollamaPropertiesConfig;

    @Bean
    public Map<String, OllamaChatModel> chatModelLlama3() {
        Map<String, OllamaChatModel> modelList = new HashMap<>();
        for (Map.Entry<String, Map<String, String>> model : ollamaPropertiesConfig.getOllama().entrySet()) {
            modelList.put(model.getKey(),
                    createModel(model.getKey(), Float.parseFloat(model.getValue().get("temperature"))));
        }
        return modelList;
    }

    private OllamaChatModel createModel(String modelName, float temperature) {
        OllamaApi api = new OllamaApi();
        OllamaOptions options = OllamaOptions.create()
                .withTemperature(temperature)
                .withModel(modelName);
        return new OllamaChatModel(api, options);
    }

}
