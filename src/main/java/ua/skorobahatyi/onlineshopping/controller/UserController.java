package ua.skorobahatyi.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ua.skorobahatyi.onlineshopping.model.User;
import ua.skorobahatyi.onlineshopping.service.UserService;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ResponseStatus(CREATED)
    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<HttpStatus> createUser(@RequestBody User userBody) {
        //logger.debug("POST /user");
        User user = userService.createUser(userBody);

        //logger.info("User {} has been created.", user.getId());
        return new ResponseEntity<>(CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<User>> getAllUsers() {
        //logger.debug("GET /users, all users");
        List<User> users = userService.getUsers();

        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        //logger.debug("GET /users/{}", id);
        User user = userService.getUser(id);

        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
