package ex33;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class testex33 {

    @Test
    void pickRand() {
        String actual = App.pickRand(new String[]{"a"});

        assertEquals("a",actual);
    }



}
