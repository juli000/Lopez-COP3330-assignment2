package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class testex26 {

    @Test
    void paymentCalculator() {
        double actual = PaymentCalculator.calculateMonthsUntilPaidOff((12.0/100.0)/365.0,5000,100.0);

        assertEquals(70,actual);
    }

}
