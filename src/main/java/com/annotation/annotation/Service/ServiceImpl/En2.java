package com.annotation.annotation.Service.ServiceImpl;

import com.annotation.annotation.Service.Encryption;
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
