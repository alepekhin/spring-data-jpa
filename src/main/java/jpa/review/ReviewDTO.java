package jpa.review;

/**
 * Restrict fields shown to user.
 */
public class ReviewDTO {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
