package tests;

import controller.Conventional2;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Conventional2Test {

    @Test
    void testCountRatingEqual5ByNutFusion() {
        Conventional2 app = new Conventional2();
        int total = app.countRatingEqual5ByBrand("NutFusion");
        assertEquals(6, total);
    }

    @Test
    void testCountRatingEqual5ByPastaPro() {
        Conventional2 app = new Conventional2();
        int total = app.countRatingEqual5ByBrand("PastaPro");
        assertEquals(13, total);
    }

    @Test
    void testCountRatingEqual5ByChocoLux() {
        Conventional2 app = new Conventional2();
        int total = app.countRatingEqual5ByBrand("ChocoLux");
        assertEquals(12, total);
    }
}
