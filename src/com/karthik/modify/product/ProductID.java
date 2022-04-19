package com.karthik.modify.product;

public class ProductID {
    static int productId = 1;

    public int getProductId()
    {
        return productId++;
    }
}
