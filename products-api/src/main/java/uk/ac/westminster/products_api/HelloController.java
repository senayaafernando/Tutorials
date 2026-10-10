package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello from spring boot!";
    }

    @GetMapping("/status")
    public String Status(){
        return "Ok " + LocalDate.now().toString();
    }
}
