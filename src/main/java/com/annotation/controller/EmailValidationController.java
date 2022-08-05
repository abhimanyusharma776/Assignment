package com.annotation.controller;

import com.annotation.entity.TestEmailEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class EmailValidationController {
    @GetMapping("/email")
    public String email(@Valid @RequestBody TestEmailEntity email){
        TestEmailEntity testEmailEntity =new TestEmailEntity();
        testEmailEntity.setEId(email.getEId());
        return testEmailEntity.getEId();
    }
}
