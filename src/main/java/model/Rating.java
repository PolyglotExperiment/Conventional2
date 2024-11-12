package model;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import ef.qb.core.annotation.PersistenceType;
import static ef.qb.core.utils.PersistenceTypeConstants.MONGODB;
import java.io.Serializable;
import org.bson.types.ObjectId;

@Entity
@PersistenceType(MONGODB)
public class Rating implements Serializable {

    // unique id
    @Id
    private ObjectId id;

    // name of the evaluated product
    private String product;

    // comment about the product.
    private String comment;

    // rating value. the rating is on a scale of 1 to 5,
    // with 1 indicating very unsatisfactory and 5 indicating exceptional.
    private int value;

    // origin of rating, e.g, app, site.
    private String source;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

}
