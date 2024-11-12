package controller;

import dao.ProductDAO;
import dao.RatingDAO;
import ef.qb.core.QueryBuilder;

public class Simple2 {

    private static ProductDAO productDAO;
    private static RatingDAO ratingDAO;

    public Simple2() {
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
