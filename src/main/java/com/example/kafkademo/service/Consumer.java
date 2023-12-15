package com.example.kafkademo.service;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

  @KafkaListener(topics = "firstTopic",groupId="topicGroupID")
  public void listenMessage(String receivedMessage){
    System.out.printf("Received Message "+ receivedMessage);
  }
}