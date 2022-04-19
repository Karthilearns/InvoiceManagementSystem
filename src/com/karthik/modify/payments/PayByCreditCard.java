package com.karthik.modify.payments;

public class PayByCreditCard implements PaymentFactory{
    final int SERVICE_CHARGE = 10;
    public int calculateServiceCharge(int purchaseAmount)
    {
        //logic
        return 0;
    }


}
