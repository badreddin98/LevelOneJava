package com.bader.marketplace;

public class Offer {

    private int id;
    private HomeListing listing;
    private Buyer buyer;
    private int amount;
    private String date;
    private String status;

    public Offer(int id, HomeListing listing, Buyer buyer, int amount, String date, String status) {
        this.id = id;
        this.listing = listing;
        this.buyer = buyer;
        this.amount = amount;
        this.date = date;
        this.status = status;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HomeListing getListing() {
        return listing;
    }

    public void setListing(HomeListing listing) {
        this.listing = listing;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Offer " + "Id " + id
                + ", listing " + listing
                + ", buyer " + buyer
                + ", amount " + amount
                + ", date " + date
                + ", status " + status;
    }
}
