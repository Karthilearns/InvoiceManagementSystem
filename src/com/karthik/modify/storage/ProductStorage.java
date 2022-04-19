package com.karthik.modify.storage;

import com.karthik.base.Product;
import com.karthik.modify.Beans;
import com.karthik.modify.operations.CreateProduct;
import com.karthik.modify.product.ProductID;
import com.karthik.modify.product.ProductModel;

import java.util.ArrayList;
import java.util.Hashtable;

public class ProductStorage {
   static Hashtable<Integer,ProductModel> productStorageList =new  Hashtable<>();

    public ProductStorage()
    {
        Beans beans = new Beans();
        CreateProduct createProduct = beans.fetchCreateProductBean();

    }
    public void addProduct(int productId,ProductModel productModel)
    {
        Beans beans = new Beans();
        ProductID productIDBean = beans.createProductIdBean();

        productStorageList.put(productId,productModel);
    }

    public Hashtable<Integer,ProductModel> getAllProducts()
    {
        return productStorageList;
    }
}
