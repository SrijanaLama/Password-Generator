package com.srijanalama.projects.passwordGenerator.controller;

import com.srijanalama.projects.passwordGenerator.model.Password;
import com.srijanalama.projects.passwordGenerator.service.PasswordService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/password/")
public class PasswordController {

    @Autowired
    private PasswordService passwordService;
    @GetMapping()
    public ResponseEntity<?> getPassword(@RequestBody Password password){
        return  new ResponseEntity<>(passwordService.generatePassword(password), HttpStatus.OK);
    }


}
