package source.springoauth2.controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import source.springoauth2.dtos.UserRequestBodyDTO;
import source.springoauth2.dtos.UserResponseBodyDTO;
import source.springoauth2.services.UsersService;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api/v1/users")
public class UsersController {
    @Autowired
    private UsersService service;

    @PostMapping
    public ResponseEntity<UserResponseBodyDTO> handleCreateUser(
            @RequestBody @Valid UserRequestBodyDTO userRequestBodyDTO) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(service.save(userRequestBodyDTO));
    }
}
