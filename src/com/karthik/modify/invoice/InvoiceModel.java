package com.karthik.modify.invoice;

import com.karthik.modify.payments.PaymentFactory;
import com.karthik.modify.product.ProductListingModel;

public class InvoiceModel {
    int invoiceId;
    PaymentFactory paymentType;
    ProductListingModel productListingModel;
    int totalPrice;

    public int getInvoiceId() {
        return invoiceId;
    }

    public PaymentFactory getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentFactory paymentType) {
        this.paymentType = paymentType;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public ProductListingModel getProductListingModel() {
        return productListingModel;
    }

    public void setProductListingModel(ProductListingModel productListingModel) {
        this.productListingModel = productListingModel;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
