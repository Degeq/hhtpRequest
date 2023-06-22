import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class Cat {
    protected String id;
    protected String text;
    protected String type;
    protected String user;
    protected Integer upvotes;

    public Cat (
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") Integer upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    @Override
    public String toString() {
        System.out.println();
        return "ID автора: " + id +
                "\nИмя автора: " + user +
                "\nФакт о кошках: " + text;
    }

    public Integer getUpvotes() {

        return upvotes;
    }
}
