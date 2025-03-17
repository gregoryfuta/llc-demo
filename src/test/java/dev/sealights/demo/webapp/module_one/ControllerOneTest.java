package dev.sealights.demo.webapp.module_one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerOneTest {

    ControllerOne controllerOne = new ControllerOne(new ServiceOne());

    @Test
    void helloOne() {
        final String result = controllerOne.helloOne("ONE");
        assertEquals("helloOne: Hello passed: ONE", result);
    }

    @Test
    void byeOne() {
        final String result = controllerOne.byeOne("BYE ONE");
        assertEquals("byeOne: Bye passed: BYE ONE", result);
    }
}