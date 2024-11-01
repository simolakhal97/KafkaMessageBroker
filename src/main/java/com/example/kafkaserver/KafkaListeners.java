package com.example.kafkaserver;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
@KafkaListener(
        topics = "mohammedLakhal",
            groupId = "groupId")
    void listen(String  data) {
System.out.println("Received data: " + data+"😈😈😈😈😈🩴🩴");
    }
}
