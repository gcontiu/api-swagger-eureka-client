package hello;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("/product")
@Api(value="Employee Management System", description="Operations pertaining to employee in Employee Management System")
public class HelloController {

    @ApiOperation(value = "View a list of available employees", response = List.class)
    @RequestMapping("/hello")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
}
