package com.sachin.Project1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class DBService {


    private final DB db;
    //constructor injection
    public DBService(DB db) {
        this.db = db;
    }

    String getData(){
        return  db.getData();
    }
}
