package com.karthik.base;

public class Invoice {

    int invoiceNumber;
    String itemName;
    int totalNumber;
    int price;
    int totalPrice;
    int invoiceNumberCount;
    public Invoice(int invoiceNumberCount, String itemName, int totalNumber, int price, int totalPrice) {
        this.invoiceNumber = invoiceNumberCount;
        this.itemName = itemName;
        this.totalNumber = totalNumber;
        this.price = price;
        this.totalPrice = totalPrice;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(int totalNumber) {
        this.totalNumber = totalNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "com.karthik.base.Invoice{" +
                "invoiceNumber=" + invoiceNumber +
                ", itemName='" + itemName + '\'' +
                ", totalNumber=" + totalNumber +
                ", price=" + price +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
