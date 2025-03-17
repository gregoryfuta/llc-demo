package dev.sealights.demo.webapp.module_one;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ControllerOne {

    private final ServiceOne serviceOne;

    public ControllerOne(final ServiceOne serviceOne) {
        this.serviceOne = serviceOne;
    }

    @GetMapping("/hello/{id}")
    public String helloOne(@PathVariable(required = false) String id) {
        return "helloOne: " + serviceOne.helloOne("passed: " + id);
    }

    @GetMapping("/bye/{id}")
    public String byeOne(@PathVariable(required = false) String id) {
        return "byeOne: " + serviceOne.byeOne("passed: " + id);
    }
}
