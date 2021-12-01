package ex39;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class testex39 {
    @Test
    void getFirst() {
        Employee s = new Employee("Julio", "Lopez","2020","Manager");
        String actual = s.getFirst();
        assertEquals("Julio",actual);
    }
    @Test
    void getPos() {
        Employee s = new Employee("Julio", "Lopez","2020","Manager");
        String actual = s.getPos();
        assertEquals("2020",actual);
    }
    @Test
    void getDate() {
        Employee s = new Employee("Julio", "Lopez","2020","Manager");
        String actual = s.getSepDate();
        assertEquals("Manager",actual);
    }


}
