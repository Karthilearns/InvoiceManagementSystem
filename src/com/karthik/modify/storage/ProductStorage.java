package com.karthik.modify.storage;

import com.karthik.base.Product;
import com.karthik.modify.Beans;
import com.karthik.modify.product.ProductID;
import com.karthik.modify.product.ProductModel;

import java.util.Hashtable;

public class ProductStorage {
    Hashtable<Integer,ProductModel> productStorage =new  Hashtable<>();

//    public ProductStorage()
//    {
//        productStorage.put(1, )
//    }
    public void addProduct(ProductModel productModel)
    {
        Beans beans = new Beans();
        ProductID productIDBean = beans.createProductIdBean();
        int productId = productIDBean.getProductId();
        productStorage.put(productId,productModel);
    }

}
