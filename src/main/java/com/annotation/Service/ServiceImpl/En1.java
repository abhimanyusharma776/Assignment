package com.annotation.Service.ServiceImpl;

import com.annotation.Service.Encryption;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary // primary annotation is used to specify the precedence of bean injection to the compiler
@Qualifier("En1")
public class En1 implements Encryption {

    @Override
    public String getName() {
        return "Primary bean method ";
    }
}
