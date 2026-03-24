package com.spring.docker.message;

import com.spring.docker.message.dto.CreateMessage;
import com.spring.docker.message.persistence.Message;
import com.spring.docker.message.persistence.MessageRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/messages")
public class MessageController {
    private final MessageRepository messageRepository;

    public MessageController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody CreateMessage req){
        var message = Message.builder()
                .content(req.content())
                .build();
        var messageSaved = messageRepository.save(message);

        return ResponseEntity.status(HttpStatus.CREATED).body(messageSaved);
    }

    @GetMapping
    public List<Message> getAll(){
        return messageRepository.findAll();
    }
}
