import org.junit.jupiter.api.Test;
import org.vsu.Main;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testTypicalCase() {
        assertEquals(5, Main.maxProfit(new int[]{7, 1, 2, 5, 6, 4}));
    }

    @Test
    void testNoProfit() {
        assertEquals(0, Main.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    @Test
    void testSingleElement() {
        assertEquals(0, Main.maxProfit(new int[]{5}));
    }

    @Test
    void testAlreadyMinFirst() {
        assertEquals(4, Main.maxProfit(new int[]{1, 5}));
    }

    @Test
    void testAllSame() {
        assertEquals(0, Main
                .maxProfit(new int[]{3, 3, 3, 3}));
    }
}