package doitwell.group.springaws.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("aws")
public class AwsController {

    ObjectMapper mapper = new ObjectMapper();
    @GetMapping
    public ResponseEntity<String> mbolo() throws JsonProcessingException {
        return ResponseEntity.ok(mapper.writeValueAsString(new User("mc","mvambodo"))) ;
    }
}

record User(String username, String password){}