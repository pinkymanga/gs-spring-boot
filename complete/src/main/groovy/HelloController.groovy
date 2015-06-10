package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/groovy")
    public String index() {
        return "Greetings from Groovy!";
    }
    
}
