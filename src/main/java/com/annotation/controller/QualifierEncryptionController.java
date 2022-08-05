package com.annotation.controller;

import com.annotation.Service.Encryption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qualifier")
public class QualifierEncryptionController {
    private final Encryption encryption;
    @Autowired
    public QualifierEncryptionController(@Qualifier("En2") Encryption encryption) // @qualifier annotation specifies the bean to be injected for this call
    {
        this.encryption = encryption;
    }

    @GetMapping
    public String getName(){
        return encryption.getName();
    }
}
