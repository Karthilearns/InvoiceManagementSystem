package com.karthik.modify.operations;

import com.karthik.modify.Beans;
import com.karthik.modify.product.ProductModel;
import com.karthik.modify.standardIO.StandardOutput;
import com.karthik.modify.storage.ProductStorage;

import java.util.ArrayList;
import java.util.Hashtable;

public class ProductPrinter implements OperationsFactory{
    public void execute()
    {
        Beans beans = new Beans();
        StandardOutput standardOutput =  beans.createStandardOutputBean();
        ProductStorage productStorage = beans.createProductStorageBean();
        Hashtable<Integer,ProductModel> productModelsList = productStorage.getAllProducts();
        standardOutput.printAllProducts(productModelsList);
    }
}
