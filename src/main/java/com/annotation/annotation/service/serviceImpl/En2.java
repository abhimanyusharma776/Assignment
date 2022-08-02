package com.annotation.annotation.service.serviceImpl;

import com.annotation.annotation.service.Encryption;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("En2")
public class En2 implements Encryption {

    @Override
    public String getName() {
        return "Qualifier used for 2nd bean";
    }
}
