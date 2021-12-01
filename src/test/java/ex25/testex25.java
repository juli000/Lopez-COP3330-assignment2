package ex25;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class testex25 {

    @Test
    void passwordValidator() {
        int actual = App.passwordValidator("bruh");

        assertEquals(2,actual);
    }
    @Test
    void numberCheck() {
        int actual = App.numberCheck("123abc");

        assertEquals(3,actual);
    }

    @Test
    void letterCheck() {
        int actual = App.letterCheck("1234abcd");

        assertEquals(4,actual);
    }
    @Test
    void specialCheck() {
        int actual = App.specialCheck("123abc@#$");

        assertEquals(3,actual);
    }
}
