package com.example.kafkademo.controller;

import com.example.kafkademo.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class KafkaController {


  @Autowired
  private Producer producer;
  @GetMapping("/producer")
  public String getMessage(@RequestParam("message") String message){
    producer.sendMessage(message);
    return "message received "+message;
  }

}
