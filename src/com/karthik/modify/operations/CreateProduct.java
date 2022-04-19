package com.karthik.modify.operations;

import com.karthik.base.Operations;
import com.karthik.base.Product;
import com.karthik.modify.Beans;
import com.karthik.modify.product.ProductID;
import com.karthik.modify.product.ProductModel;
import com.karthik.modify.standardIO.StandardInput;
import com.karthik.modify.standardIO.StandardOutput;
import com.karthik.modify.storage.ProductStorage;

public class CreateProduct implements OperationsFactory
{
    @Override
    public void execute() {
        Beans beans = new Beans();
        StandardInput standardInput = beans.createStandardInputBean();
        ProductStorage productStorage = beans.createProductStorageBean();
        ProductID productIDbean = beans.createProductIdBean();
        StandardOutput standardOutput = beans.createStandardOutputBean();
        int productId = productIDbean.getProductId();
        standardOutput.printForProductNameInput();
        String productName = standardInput.fetchProductName();
        standardOutput.printForProductPrice();
        int productPrice = standardInput.fetchProductPrice();
        ProductModel productModel = beans.createProductModel(productId,productName,productPrice);
        productStorage.addProduct(productId,productModel);
    }
}
