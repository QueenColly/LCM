import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {

    @Test
    public void shouldFindLcmOfThreeNumbers() {
        assertEquals(24, Main.lcm(2, 8, 12));
    }

    @Test
    public void shouldFindLcmOfThreeOtherNumbers() {
        assertEquals(210, Main.lcm(7, 6, 5));
    }
}
