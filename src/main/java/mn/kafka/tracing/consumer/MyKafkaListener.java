package mn.kafka.tracing.consumer;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.tracing.annotation.NewSpan;
import lombok.extern.slf4j.Slf4j;

@KafkaListener
@Slf4j
public class MyKafkaListener {

//    @NewSpan("my-listener-span")
    @Topic("mine")
    public void receive(@KafkaKey String key, String value) {
        log.info("Received message: {} {}", key, value);
    }

}
