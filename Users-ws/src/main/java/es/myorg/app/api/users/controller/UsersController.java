package es.myorg.app.api.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users") // http://localhost:8080/users
public class UsersController {
    
    private Environment environment;

    @Autowired
    public UsersController (Environment environment) {
        this.environment = environment;
    }
    
    @GetMapping (path="/status")
    public String status() {
        return "Service: "+ environment.getProperty("spring.application.name") + "\nWorking on port: " + environment.getProperty("local.server.port");
    }
    
}
