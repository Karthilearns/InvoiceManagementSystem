package com.karthik.modify.payments;

public class PayByCash implements PaymentFactory{
    final int SERVICE_CHARGE = 15;
    public int calculateServiceCharge(int purchaseAmount)
    {
        //logic
        return 0;
    }

}
