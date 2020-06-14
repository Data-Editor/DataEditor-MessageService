package com.niek125.messageservice.controller;

import com.niek125.messageservice.models.Message;
import com.niek125.messageservice.repository.MessageRepo;
import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Log4j2
@RestController
@RequestMapping("/messages")
public class MessageController {
    private final MessageRepo messageRepo;

    @Autowired
    public MessageController(MessageRepo messageRepo) {
        this.messageRepo = messageRepo;
    }

    @GetMapping()
    public ResponseEntity<List<Message>> getMessages(@RequestParam("projectId") String projectId) {
        log.info("getting messages");
        final List<Message> messages = messageRepo.findMessagesByProjectId(projectId);
        log.info("returning messages");
        return new ResponseEntity<>(messages, HttpStatus.OK);
    }
}
