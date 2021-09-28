package ex29;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class testex29 {

    @Test
    void checkNum() {
        boolean actual = App.checkNum("a");

        assertFalse(actual);
    }

}
