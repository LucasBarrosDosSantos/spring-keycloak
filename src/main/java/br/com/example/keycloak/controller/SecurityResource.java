package br.com.example.keycloak.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("security")
public class SecurityResource {

    @GetMapping
    public ResponseEntity<?> security() {
        return ResponseEntity.ok().build();
    }

}
