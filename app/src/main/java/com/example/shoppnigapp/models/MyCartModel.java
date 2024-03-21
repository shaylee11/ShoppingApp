package com.example.shoppnigapp.models;

public class MyCartModel {

    String currentTime;
    String currentDate;
    String currentName;
    String currentPrice;
    String currentQuantity;
    int totalprice;

    public MyCartModel() {
    }

    public MyCartModel(String currentTime, String currentDate, String currentName, String currentPrice, String currentQuantity, int totalprice) {
        this.currentTime = currentTime;
        this.currentDate = currentDate;
        this.currentName = currentName;
        this.currentPrice = currentPrice;
        this.currentQuantity = currentQuantity;
        this.totalprice = totalprice;
    }

    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

    public String getCurrentName() {
        return currentName;
    }

    public void setCurrentName(String currentName) {
        this.currentName = currentName;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(String currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }
}
