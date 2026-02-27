package task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import task3.space.Planet;

import static org.junit.jupiter.api.Assertions.*;

public class PlanetTest {
    private Planet planet1;
    private Planet planet2;

    @BeforeEach
    void setUp() {
        planet1 = new Planet();
        planet2 = new Planet();
        planet1.setName("Планета 1");
        planet1.setName("Планета 2");
        planet1.setPole(true);
        planet2.setPole(false);
    }

    @Test
    void planet_ChangePole_changesPole() {
        planet1.changePole();
        planet2.changePole();
        assertFalse(planet1.getPole());
        assertTrue(planet2.getPole());
    }

    @Test
    void planet_withNoPole_DoesNotChangePole() {
        Planet planet3 = new Planet();
        planet3.changePole();
        assertNull(planet3.getPole());
    }
}
