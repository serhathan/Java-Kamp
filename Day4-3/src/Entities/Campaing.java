package Entities;

public class Campaing {
    private int campaingId;
    private String campaingName;
    private double campaingDiscount;

    public Campaing(int campaingId, String campaingName, double campaingDiscount) {
        this.campaingId = campaingId;
        this.campaingName = campaingName;
        this.campaingDiscount = campaingDiscount;
    }

    public int getCampaingId() {
        return campaingId;
    }

    public void setCampaingId(int campaingId) {
        this.campaingId = campaingId;
    }

    public String getCampaingName() {
        return campaingName;
    }

    public void setCampaingName(String campaingName) {
        this.campaingName = campaingName;
    }

    public double getCampaingDiscount() {
        return campaingDiscount;
    }

    public void setCampaingDiscount(double campaingDiscount) {
        this.campaingDiscount = campaingDiscount;
    }
}
