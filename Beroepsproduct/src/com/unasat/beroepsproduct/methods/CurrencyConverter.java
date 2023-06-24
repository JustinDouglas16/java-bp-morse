package com.unasat.beroepsproduct.methods;

import com.unasat.beroepsproduct.interfaces.ICurrencyConverter;

public class CurrencyConverter implements ICurrencyConverter {

    // The exchange rate from Euro to US dollar
    private static final double EUR_TO_USD_RATE = 1.18;

    // Convert US dollar to Euro by dividing the given amount by the exchange rate
    @Override
    public double usdToEuro(double usd) {
        return usd / EUR_TO_USD_RATE;
    }

    // Convert Euro to US dollar by multiplying the given amount by the exchange rate
    @Override
    public double euroToUsd(double euro) {
        return euro * EUR_TO_USD_RATE;
    }
}
