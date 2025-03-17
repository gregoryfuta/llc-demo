package dev.sealights.demo.webapp.module_one;

import org.springframework.stereotype.Service;

@Service
public class ServiceThree {

    public String helloThree(String value) {
        return "Hello " + value;
    }

    public String byeThree(String value) {
        return "Bye " + value;
    }

}
