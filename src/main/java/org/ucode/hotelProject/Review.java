package org.ucode.hotelProject;

public class Review {
    private int stars;
    private String content;
    private Customer customer;


    public Review(int stars1, String content, Customer customer) {
        this.stars = stars1;
        this.content = content;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Review{" +
                "stars=" + stars +
                ", content='" + content + '\'' +
                ", customer=" + customer +
                '}';
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
