package com.nirdosh.domain.model.payment;

import org.springframework.stereotype.Component;

@Component
public class PaymentInfoFactory {
    public PaymentInfoFactory() {
    }

    public PaymentInfo getPaymentInfo() {
        PaymentInfo paymentInfo = new PaymentInfo(10F, 10F);
        return paymentInfo;
    }
}