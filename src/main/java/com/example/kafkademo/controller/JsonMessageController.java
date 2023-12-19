package com.example.kafkademo.controller;


import com.example.kafkademo.payload.User;
import com.example.kafkademo.service.JsonKafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/json")
public class JsonMessageController {

  @Autowired
  private JsonKafkaProducer jsonKafkaProducer;

  @PostMapping("/send")
  public ResponseEntity<String > publish(@RequestBody User user){
    jsonKafkaProducer.sendMessage(user);
    return ResponseEntity.ok("Json Message Send to kafka Topic");

  }
}
