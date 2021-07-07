package com.example.nika_mgaloblishvili_1.service;


import com.example.nika_mgaloblishvili_1.model.Currencies;
import com.example.nika_mgaloblishvili_1.model.Currency;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService
public class CurrencyService {

    @WebMethod
    public String GetCurrency(String requestedCurrency) {
        for (Currency currency : Currencies.get()) {
            if (currency.getName().equals(requestedCurrency)) {
                return String.valueOf(currency.getValue());
            }
        }

        return "Invalid currency provided.";
    }

    @WebMethod
    public String GetCurrencyDescription(String requestedCurrency) {
        for (Currency currency : Currencies.get()) {
            if (currency.getName().equals(requestedCurrency)) {
                return String.valueOf(currency.getDescription());
            }
        }

        return "Invalid currency provided.";
    }

    @WebMethod
    public List<String> GetDate() {
        List<String> dates = new ArrayList<>();
        for (Currency currency : Currencies.get()) {
            dates.add(String.valueOf(currency.getDate()));
        }
        return dates;
    }
}
