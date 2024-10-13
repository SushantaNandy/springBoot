package com.tmobile.tutorial.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

//    @Autowired
     private DB db;  // This decliration is known as field injection other one is by doing construction injection

    public DBService(DB db) {
        this.db = db;  // This is constructior injection
    }

    String getData(){
        return db.getData();
    }

}
