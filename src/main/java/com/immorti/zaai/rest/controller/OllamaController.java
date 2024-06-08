package com.immorti.zaai.rest.controller;

import com.immorti.zaai.rest.dto.MessageDto;
import com.immorti.zaai.service.OllamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/chat")
@Validated
@RestController
public class OllamaController {

    @Autowired
    private OllamaService ollamaService;

    @PostMapping(path = "/call")
    public String call(@RequestBody MessageDto message) {
        return ollamaService.call(message.getMessage());
    }

}
