package ie.atu.hello;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

        @GetMapping("/greet/{name}")
        public String greetByName(@PathVariable String name) {
            return "Hello " + name;
        }
           /* public String greetByName() {
                return "Leo";
        }*/

}
