package doitwell.group.springaws.rabbit.hello;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/book")
public class BookController {
/*
    @Autowired
    private RabbitTemplate template;
    @PostMapping("{category}")
    public ResponseEntity<OrderStatus> create(@RequestBody Book book, @PathVariable String category){
        book.setId(UUID.randomUUID().toString());
        OrderStatus orderStatus = new OrderStatus(book,"PROCESS","Book added to category: "+category);
        template.convertAndSend(RabbitMqConfig.EXCHANGE,RabbitMqConfig.ROUTING_KEY,orderStatus);
        return ResponseEntity.ok(orderStatus);
    }*/
}
