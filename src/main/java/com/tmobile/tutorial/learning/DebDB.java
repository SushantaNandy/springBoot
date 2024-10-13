package com.tmobile.tutorial.learning;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deploy.env", havingValue = "development")
//@Primary  ---> In case of ambiguity. Where both the bean is assigned.
public class DebDB implements DB{
    public String getData(){
        return "Dev Data";
    }
}
