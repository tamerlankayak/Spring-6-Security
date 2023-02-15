package azintelecom.az.securityspring6.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResources {

    @GetMapping("hello-world")
    public String helloWorld(){
        return "Salam dunya V1";
    }

}
