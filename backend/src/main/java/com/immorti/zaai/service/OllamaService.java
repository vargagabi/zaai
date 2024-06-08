package com.immorti.zaai.service;

import com.immorti.zaai.rest.dto.MessageDto;
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

    public String call(MessageDto message) {
        return "not implemented";
    }

}

