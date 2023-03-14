package org.springframework.samples.petclinic.customers.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

// This class uses the KafkaListener annotation to start listening to an event hub using the 
// $Default group of the telemetry event hub. The received messages are written to the log as info messages.

//@Service
public class EventHubListener {
/* 
   private static final Logger log = LoggerFactory.getLogger(EventHubListener.class);

   @KafkaListener(topics = "telemetry", groupId = "$Default")
     public void receive(String in) {
        log.info("Received message from kafka queue: {}",in);
        System.out.println(in);
    }
*/
} 