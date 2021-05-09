package Entities;

public class Product {
    private int id;
    private String name;
    private float unitPrice;
    private String details;
    private double discount;
    private double unitPriceAfterDiscount;


    public Product(int id, String name, float unitPrice, String details, float discount) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.details = details;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getUnitPriceAfterDiscount() {
        return unitPrice-(unitPrice*discount/100);
    }

}
