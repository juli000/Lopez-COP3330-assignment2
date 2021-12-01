package ex35;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class testex35 {

    @Test
    void pickRand() {
        ArrayList<String> t = new ArrayList<>();
        t.add("a");
        String actual = App.pickRand(t);

        assertEquals("a",actual);
    }


}
