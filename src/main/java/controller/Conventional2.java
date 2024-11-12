package controller;

import dao.ProductDAO;
import dao.RatingDAO;
import ef.qb.core.QueryBuilder;

public class Conventional2 {

    private static ProductDAO productDAO;
    private static RatingDAO ratingDAO;

    public Conventional2() {
        productDAO = QueryBuilder.create(ProductDAO.class);
        ratingDAO = QueryBuilder.create(RatingDAO.class);
    }

    public int countRatingEqual5ByBrand(String brand) {
        /*
        * implement here
         */
        return 0;
    }

}
