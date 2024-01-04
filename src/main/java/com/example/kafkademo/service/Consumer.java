package com.example.kafkademo.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;



@Service
public class Consumer {

  public static final Logger log= LoggerFactory.getLogger(Consumer.class);

  @KafkaListener(topics = "starHealth",groupId="topicGroupID")
  public void listenMessage(String receivedMessage){
    log.info("message send: {} ",receivedMessage);

  }
}