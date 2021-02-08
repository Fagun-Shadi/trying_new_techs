package com.example.restfulwebservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserDaoService service;

    //GET  /users
    //Retrieve all users
    @GetMapping(path = "/users")
    public List<User> retrieveAllUsers(){
        return service.findAll();
    }

    //GET  /users/{id}
    //retrieveUser(int id)
    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id){
        User user = service.findOne(id);

        if(user==null){
            throw new UserNotFoundException("id-"+ id);
        }

        return user;
    }

    //input - details of the user
    //output - CREATED & Return the created URI
    @PostMapping("/users")
    public ResponseEntity createUser(@RequestBody User user){
        User savedUser = service.save(user);

        //we want to append "/4" to the current URI"/users"
        //Also, we want to return status 201(CREATED) instead of 200
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

}
