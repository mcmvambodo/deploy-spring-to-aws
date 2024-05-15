package doitwell.group.springaws.rabbit.hello;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
/*
    @RabbitListener(queues = RabbitMqConfig.QUEUE)
    public void consume(OrderStatus orderStatus){
        System.out.println(" [x] consuming from queue: "+RabbitMqConfig.QUEUE+ " payload: "+orderStatus);
    }*/
}
