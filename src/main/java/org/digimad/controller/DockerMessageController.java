package org.digimad.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerMessageController {

    @GetMapping("/messages")
    public ResponseEntity<String> getMessage() {
        return ResponseEntity.ok("Hello from Docker!");
    }

//    @GetMapping("/messages")
//    public String getMessage() {
//        return "Hello from Docker!";
//    }

}
