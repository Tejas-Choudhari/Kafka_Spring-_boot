package com.example.kafkademo.service;


import com.example.kafkademo.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

  public static final Logger log = LoggerFactory.getLogger(JsonKafkaConsumer.class);

  @KafkaListener(topics = "jsonStarHealth",groupId = "jsonid")
  public void jsonConsumer(User user){

    log.info("Json message received");
  }

}
