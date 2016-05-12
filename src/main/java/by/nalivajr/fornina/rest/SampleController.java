package by.nalivajr.fornina.rest;

import by.nalivajr.fornina.models.User;
import by.nalivajr.fornina.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SampleController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users/all")
    private List<User> getAllUsers() {
        return userService.getAllUsers();

    }
}
