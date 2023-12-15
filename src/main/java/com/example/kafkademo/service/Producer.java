package com.example.kafkademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

  @Autowired
  KafkaTemplate<String ,String> kafkaTemplate;

  public void sendMessage(String message){
    kafkaTemplate.send("firstTopic",message);
  }
}
