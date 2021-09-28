package ex31;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class testex31 {

    @Test
    void checkNum() {
        boolean actual = App.checkNum("a");

        assertFalse(actual);
    }

    @Test
    void rateCalc() {
        double actual = App.rateCalc(22,65,55);

        assertEquals(138.0,actual);
    }


}
