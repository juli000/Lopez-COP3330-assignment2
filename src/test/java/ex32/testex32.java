package ex32;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class testex32 {

    @Test
    void checkNum() {
        boolean actual = ex31.App.checkNum("a");

        assertFalse(actual);
    }

}
