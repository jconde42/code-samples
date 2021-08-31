package vacuumCleanerRoute;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VacuumCleanerTest {

    @Test
    void isRoutedToOriginWIthLRReturnsTrue() throws Exception {
        String route = "LR";

        boolean result = VacuumCleaner.isRoutedToOrigin(route);

        assertTrue(result);
    }

    @Test
    void isRoutedToOriginWithLRLReturnsFalse() throws Exception {
        String route = "LRL";

        boolean result = VacuumCleaner.isRoutedToOrigin(route);

        assertFalse(result);
    }

    @Test
    void isRoutedToOriginWithRUULLDRDReturnsTrue() throws Exception {
        String route = "RUULLDRD";

        boolean result = VacuumCleaner.isRoutedToOrigin(route);

        assertTrue(result);
    }

}