package mn.kafka.tracing;

import io.micronaut.context.event.ApplicationEventListener;
import io.micronaut.runtime.event.ApplicationStartupEvent;
import io.micronaut.tracing.annotation.NewSpan;
import lombok.extern.slf4j.Slf4j;
import mn.kafka.tracing.producer.MyKafkaClient;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
@Slf4j
public class StartupListener implements ApplicationEventListener<ApplicationStartupEvent> {

    @Inject
    MyKafkaClient myKafkaClient;

//    @NewSpan("mySpan")
    @Override
    public void onApplicationEvent(ApplicationStartupEvent event) {
        log.info("Sending kafka messsage");
        myKafkaClient.send("foo", "bar");
    }
}
