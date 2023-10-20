package lk.jiat.webapp.dto;

public class ProductDTO {

    private long Id;
    private String title;
    private double price;

    public ProductDTO() {
    }

    public ProductDTO(long id, String title, double price) {
        Id = id;
        this.title = title;
        this.price = price;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
