package com.example.multi_stage_dockerfile;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public ResponseEntity<String> greet() {
        return ResponseEntity.ok().body("Hello, Multi stage Docker !");
    }


    @GetMapping("/exit")
    public ResponseEntity<String> exit() {
        return ResponseEntity.ok().body("Bye, Multi stage docker.");
    }
}
