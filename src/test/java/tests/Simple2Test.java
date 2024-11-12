package tests;

import controller.Simple2;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Simple2Test {

    @Test
    void testCountRatingEqual5ByNutFusion() {
        Simple2 app = new Simple2();
        int total = app.countRatingEqual5ByBrand("NutFusion");
        assertEquals(6, total);
    }

    @Test
    void testCountRatingEqual5ByPastaPro() {
        Simple2 app = new Simple2();
        int total = app.countRatingEqual5ByBrand("PastaPro");
        assertEquals(13, total);
    }

    @Test
    void testCountRatingEqual5ByChocoLux() {
        Simple2 app = new Simple2();
        int total = app.countRatingEqual5ByBrand("ChocoLux");
        assertEquals(12, total);
    }
}
