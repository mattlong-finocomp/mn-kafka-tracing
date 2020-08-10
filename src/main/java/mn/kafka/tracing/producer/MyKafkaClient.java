package mn.kafka.tracing.producer;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.tracing.annotation.NewSpan;

@KafkaClient("my-client")
public interface MyKafkaClient {

    @Topic("mine")
    void send(@KafkaKey String key, String value);
}
