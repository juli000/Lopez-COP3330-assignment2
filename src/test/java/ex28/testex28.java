package ex27;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testex27 {

    @Test
    void checkFill() {
        boolean actual = App.checkFill("");

        assertFalse(actual);
    }
    @Test
    void check2() {
        boolean actual = App.check2("ab");

        assertTrue(actual);
    }
    @Test
    void checkForm() {
        boolean actual = App.checkForm("AA-1234");

        assertTrue(actual);
    }
    @Test
    void checkNum() {
        boolean actual = App.checkNum("12345");

        assertTrue(actual);
    }
}
