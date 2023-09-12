package com.shamstabrez16.kafkaconsumer.listener;


import com.shamstabrez16.studentmanagementsystem.model.TestUser;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "java_in_use_topic",groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }

    @KafkaListener(topics = "json_in_use_topic", groupId = "group_json",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(TestUser testUser) {
        System.out.println("Consumed JSON Message: " + testUser.toString());
    }
}
