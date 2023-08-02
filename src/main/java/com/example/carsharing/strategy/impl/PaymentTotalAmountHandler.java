package com.example.carsharing.strategy.impl;

import com.example.carsharing.model.Payment;
import com.example.carsharing.model.Rental;
import com.example.carsharing.strategy.TotalAmountHandler;
import java.math.BigDecimal;
import org.springframework.stereotype.Service;

@Service
public class PaymentTotalAmountHandler implements TotalAmountHandler {
    private static BigDecimal PER_HOUR = BigDecimal.valueOf(5);

    @Override
    public BigDecimal getTotalAmount(Rental rental) {
        BigDecimal rentHours = BigDecimal.valueOf(getRentHours(rental));
        return rentHours.multiply(PER_HOUR);
    }

    @Override
    public boolean isApplicable(Payment.Type type) {
        return type == Payment.Type.PAYMENT;
    }

}
