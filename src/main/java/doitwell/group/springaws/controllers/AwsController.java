package doitwell.group.springaws.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("aws")
public class AwsController {
    @GetMapping
    public String mbolo(){
        return "Mbolo oh";
    }
}
