package com.ai.springAIDemo.controller;

import com.ai.springAIDemo.service.ChatService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenAIController {

   private final ChatService chatService;

    public GenAIController(ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping("ask-ai")
    public String getResponse(@RequestParam("prompt") String prompt){
        return chatService.getResponse(prompt);
    }
}
