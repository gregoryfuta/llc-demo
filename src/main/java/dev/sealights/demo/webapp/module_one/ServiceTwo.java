package dev.sealights.demo.webapp.module_one;

import org.springframework.stereotype.Service;

@Service
public class ServiceTwo {

    public String helloTwo(String value) {
        return "Hello " + value;
    }

    public String byeTwo(String value) {
        return "Bye " + value;
    }

}
