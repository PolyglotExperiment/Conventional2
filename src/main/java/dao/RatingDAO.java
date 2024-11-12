package dao;

import ef.qb.core.Repository;
import ef.qb.core.annotation.TargetEntity;
import java.util.List;
import model.Rating;

@TargetEntity(Rating.class)
public interface RatingDAO extends Repository<Rating> {

    List<Rating> getRating();

    List<Rating> getRatingByProduct(String product);

    List<Rating> getRatingByComment(String comment);

    List<Rating> getRatingByValue(int value);

    List<Rating> getRatingBySource(String source);

}
