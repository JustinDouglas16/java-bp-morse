package com.unasat.beroepsproduct.interfaces;
/**
 * This interface provides a contract for converting currency from US Dollar (USD) to Euro (EUR)
 * and vice versa. Implementing classes must provide implementation for the following methods:
 * - usdToEuro: converts the given amount in USD to EUR
 * - euroToUsd: converts the given amount in EUR to USD
 */
public interface ICurrencyConverter {
    /**
     * Converts the given amount in US Dollar (USD) to Euro (EUR) based on the current exchange rate.
     *
     * @param usd the amount in USD to convert to EUR
     * @return the converted amount in EUR
     */
    double usdToEuro(double usd);/**
     * Converts the given amount in Euro (EUR) to US Dollar (USD) based on the current exchange rate.
     *
     * @param euro the amount in EUR to convert to USD
     * @return the converted amount in USD
     */
    double euroToUsd(double euro);
}