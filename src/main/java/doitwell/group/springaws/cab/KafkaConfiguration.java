package doitwell.group.springaws.cab;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import static doitwell.group.springaws.cab.Common.CAB_LOCATION;

@Configuration
public class KafkaConfiguration {
    @Bean
    public NewTopic topic(){
        return TopicBuilder
                .name(CAB_LOCATION)
                .build();
    }
}
