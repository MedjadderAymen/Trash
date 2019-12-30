package dz.trash.TrashBackend.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhotoController {

    @RequestMapping("/hello")
    public String getHelloWorld(){
        return "hello world";
    }

}
