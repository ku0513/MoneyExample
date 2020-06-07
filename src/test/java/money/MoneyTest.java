package money;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {
    @Test
    public void testMultiplication() {
        Doller five = new Doller(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
