package dev.sealights.demo.webapp.module_one;

import org.springframework.stereotype.Service;

@Service
public class ServiceOne {

    public String helloOne(String value) {
        return "Hello " + value;
    }

    public String byeOne(String value) {
        return "Bye " + value;
    }

}
