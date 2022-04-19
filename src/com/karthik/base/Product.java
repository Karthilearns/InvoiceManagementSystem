package com.karthik.base;

public class Product {

    int productid;
    String product_name;
    int product_price;

    int productCount=0;
    public Product(String product_name, int product_price) {
        this.productid= ++productCount;
        this.product_name = product_name;
        this.product_price = product_price;
    }
    public Product()
    {

    }


    @Override
    public String toString() {
        return "com.karthik.base.Product{" +
                "product_name='" + product_name + '\'' +
                ", product_price=" + product_price +
                '}';
    }

    public int getProduct() {
        return productid;
    }

    public void setProduct(int productid) {
        this.productid = productid;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }
}
