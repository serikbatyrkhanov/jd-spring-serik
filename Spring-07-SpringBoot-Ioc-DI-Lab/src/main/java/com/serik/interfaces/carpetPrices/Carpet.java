package com.serik.interfaces.carpetPrices;

import com.serik.enums.City;

import java.math.BigDecimal;

public interface Carpet {

    BigDecimal getSqFtPrice(City city);
}
