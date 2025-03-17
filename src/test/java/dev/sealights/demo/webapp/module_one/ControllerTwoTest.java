package dev.sealights.demo.webapp.module_one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ControllerTwoTest {

    ControllerTwo controllerOne = new ControllerTwo(new ServiceTwo());

    @Test
    void helloTwo() {
        final String result = controllerOne.helloTwo("ONE");
        assertEquals("helloTwo: Hello passed: ONE", result);

    }

    @Test
    void byeTwo() {
        final String result = controllerOne.byeTwo("BYE ONE");
        assertEquals("byeTwo: Bye passed: BYE ONE", result);
    }
}