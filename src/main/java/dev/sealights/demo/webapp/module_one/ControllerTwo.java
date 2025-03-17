package dev.sealights.demo.webapp.module_one;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ControllerTwo {

    private final ServiceTwo serviceOne;

    public ControllerTwo(final ServiceTwo serviceOne) {
        this.serviceOne = serviceOne;
    }

    @GetMapping("/hello/{id}")
    public String helloTwo(@PathVariable(required = false) String id) {
        return "helloTwo: " + serviceOne.helloTwo("passed: " + id);
    }

    @GetMapping("/bye/{id}")
    public String byeTwo(@PathVariable(required = false) String id) {
        return "byeTwo: " + serviceOne.byeTwo("passed: " + id);
    }
}
