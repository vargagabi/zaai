package com.immorti.zaai.event;

import com.immorti.zaai.service.OllamaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class ApplicationStartEvent {

    @Autowired
    private OllamaService ollamaService;

    @EventListener
    public void onApplicationStart(ApplicationStartedEvent event) {
        log.info("Application started...");
    }

}
