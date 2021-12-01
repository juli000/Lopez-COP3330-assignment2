package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testex24 {

    @Test
    void isAnagramReturnTrue() {
        boolean actual= App.isAnagram("note","tone");

        assertEquals(true,actual);
    }

    @Test
    void isAnagramReturnFalse() {
        boolean actual=App.isAnagram("note","ton");

        assertEquals(false,actual);
    }
}
