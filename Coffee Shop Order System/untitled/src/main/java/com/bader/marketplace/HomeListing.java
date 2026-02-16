package com.bader.marketplace;

public class HomeListing {

    private int id;
    private String address;
    private double price;
    private byte beds;
    private byte baths;
    private ListingStatus status;
    private Seller seller;


    public HomeListing(int id, String address, double price,
                       byte beds, byte baths, ListingStatus status, Seller seller){
        this.id = id;
        this.address = address;
        this.price = price;
        this.beds = beds;
        this.baths = baths;
        this.status = status;
        this.seller = seller;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ListingStatus getStatus() {
        return status;
    }

    public void setStatus(ListingStatus status) {
        this.status = status;
    }

    public byte getBaths() {
        return baths;
    }

    public void setBaths(byte baths) {
        this.baths = baths;
    }

    public byte getBeds() {
        return beds;
    }

    public void setBeds(byte beds) {
        this.beds = beds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Homelisting {" + "Id " + id
        + ", Address " + address + ", Price " + price + ", Beds " + beds
        + ", Baths " + baths + ", Status " + status + "}";

    }
}
