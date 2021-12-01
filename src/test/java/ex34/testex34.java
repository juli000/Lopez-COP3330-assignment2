package ex34;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class testex34 {

    @Test
    void findName() {
        int actual = App.findName(new String[]{"a", "b", "c"},"a");

        assertEquals(0,actual);
    }


}
