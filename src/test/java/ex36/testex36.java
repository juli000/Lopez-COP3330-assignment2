package ex36;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class testex36 {

    @Test
    void avg() {
        ArrayList<String> t = new ArrayList<>();
        t.add("100");
        t.add("200");
        t.add("300");
        t.add("1000");
        Double actual = App.avg(t);

        assertEquals(400.0,actual);
    }
    @Test
    void max() {
        ArrayList<String> t = new ArrayList<>();
        t.add("100");
        t.add("200");
        t.add("300");
        t.add("1000");
        int actual = App.max(t);

        assertEquals(1000,actual);
    }
    @Test
    void min() {
        ArrayList<String> t = new ArrayList<>();
        t.add("100");
        t.add("200");
        t.add("300");
        t.add("1000");
        int actual = App.min(t);

        assertEquals(100,actual);
    }
    @Test
    void std() {
        ArrayList<String> t = new ArrayList<>();
        t.add("100");
        t.add("200");
        t.add("300");
        t.add("1000");
        Double actual = App.std(t);

        assertEquals(353.5533905932738,actual);
    }

    @Test
    void checkNum() {
        boolean actual = ex31.App.checkNum("a");

        assertFalse(actual);
    }


}
