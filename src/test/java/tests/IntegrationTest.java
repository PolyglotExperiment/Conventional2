package tests;

import dao.ProductDAO;
import dao.RatingDAO;
import ef.qb.core.QueryBuilder;
import java.util.List;
import model.Product;
import model.Rating;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class IntegrationTest {

    private static ProductDAO productDAO;
    private static RatingDAO ratingDAO;

    @BeforeAll
    @SuppressWarnings("unused")
    static void setUp() {
        productDAO = QueryBuilder.create(ProductDAO.class);
        ratingDAO = QueryBuilder.create(RatingDAO.class);
    }

    @Test
    void testGetProductByName() {
        List<Product> result = productDAO.getProductByName("GreekHarmony");
        assertNotNull(result);
        assertFalse(result.isEmpty(), "The result list should not be empty");
        assertTrue(result.stream().allMatch(p -> "GreekHarmony".equals(p.getName())), "All results should have name 'GreekHarmony'");
    }

    @Test
    void testGetProductByDescription() {
        List<Product> result = productDAO.getProductByDescription("Plain Greek yogurt");
        assertNotNull(result);
        assertFalse(result.isEmpty(), "The result list should not be empty");
        assertTrue(result.stream().allMatch(p -> "Plain Greek yogurt".equals(p.getDescription())), "All results should have description 'Plain Greek yogurt'");
    }

    @Test
    void testGetProductByPrice() {
        List<Product> result = productDAO.getProductByPrice(2.99d);
        assertNotNull(result);
        assertFalse(result.isEmpty(), "The result list should not be empty");
        assertTrue(result.stream().allMatch(p -> Double.valueOf(2.99d).equals(p.getPrice())), "All results should have price 2.99d");
    }

    @Test
    void testGetProductByWeight() {
        List<Product> result = productDAO.getProductByWeight(500);
        assertNotNull(result);
        assertFalse(result.isEmpty(), "The result list should not be empty");
        assertTrue(result.stream().allMatch(p -> Integer.valueOf(500).equals(p.getWeight())), "All results should have weight 500");
    }

    @Test
    void testGetProductByBrand() {
        List<Product> result = productDAO.getProductByBrand("YogurtHub");
        assertNotNull(result);
        assertFalse(result.isEmpty(), "The result list should not be empty");
        assertTrue(result.stream().allMatch(p -> "YogurtHub".equals(p.getBrand())), "All results should have brand 'YogurtHub'");
    }

    @Test
    void testGetProductBySegment() {
        List<Product> result = productDAO.getProductBySegment("Spreads");
        assertNotNull(result);
        assertFalse(result.isEmpty(), "The result list should not be empty");
        assertTrue(result.stream().allMatch(p -> "Spreads".equals(p.getSegment())), "All results should have segment 'Spreads'");
    }

    @Test
    void testGetProductByType() {
        List<Product> result = productDAO.getProductByType("Nuts");
        assertNotNull(result);
        assertFalse(result.isEmpty(), "The result list should not be empty");
        assertTrue(result.stream().allMatch(p -> "Nuts".equals(p.getType())), "All results should have type 'Nuts'");
    }

    @Test
    void testGetRatingByProduct() {
        List<Rating> result = ratingDAO.getRatingByProduct("QuickNoodles");
        assertNotNull(result);
        assertFalse(result.isEmpty(), "The result list should not be empty");
        assertTrue(result.stream().allMatch(r -> "QuickNoodles".equals(r.getProduct())), "All results should have name 'QuickNoodles'");
    }

    @Test
    void testGetRatingByComment() {
        List<Rating> result = ratingDAO.getRatingByComment("The quality was impressive and well worth it.");
        assertNotNull(result);
        assertFalse(result.isEmpty(), "The result list should not be empty");
        assertTrue(result.stream().allMatch(r -> "The quality was impressive and well worth it.".equals(r.getComment())), "All results should have comment 'The quality was impressive and well worth it.'");
    }

    @Test
    void testGetRatingByValue() {
        List<Rating> result = ratingDAO.getRatingByValue(4);
        assertNotNull(result);
        assertFalse(result.isEmpty(), "The result list should not be empty");
        assertTrue(result.stream().allMatch(r -> r.getValue() == 4), "All results should have a value of 4");
    }

    @Test
    void testGetRatingBySource() {
        List<Rating> result = ratingDAO.getRatingBySource("app");
        assertNotNull(result);
        assertFalse(result.isEmpty(), "The result list should not be empty");
        assertTrue(result.stream().allMatch(r -> "app".equals(r.getSource())), "All results should have source 'app'");
    }

}
