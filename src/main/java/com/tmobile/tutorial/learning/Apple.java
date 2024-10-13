package com.tmobile.tutorial.learning;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Service
//@Controller  ----> Other 3 are also used to make this class as Beans
//@Repository
//@Component
public class Apple {
    void eatApple(){
        System.out.println("Eat apple");
    }

    @PostConstruct
    void callThisAfterBeanIsCreated(){
        System.out.println("Get call before bean is get created");
    }

    @PreDestroy
    void beforeBeanIsDestroyed(){
        System.out.println("Call before the bean is got destroyed");
    }
}
