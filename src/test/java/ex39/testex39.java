package ex38;



import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class testex38 {
    @Test
    void filterCheck() {
        ArrayList<Integer> actual = App.filterEvenNumbers("100 200 301 1000");
        ArrayList<Integer> t = new ArrayList<>();
        t.add(100);
        t.add(200);
        t.add(1000);

        assertEquals(t,actual);
    }


}
