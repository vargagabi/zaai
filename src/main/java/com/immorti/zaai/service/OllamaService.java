package com.immorti.zaai.service;

import java.util.Map;
import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

@Service
@DependsOn("chatClientConfiguration")
public class OllamaService {

    @Autowired
    private Map<String, OllamaChatModel> ollamaChatModel;

    public String call(String message) {
        Prompt prompt = new Prompt(new UserMessage(message));
        ChatResponse response = ollamaChatModel.get("llama3").call(prompt);
        return response.getResult().getOutput().getContent();
    }

}

