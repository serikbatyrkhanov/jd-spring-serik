package com.serik.services;

import com.serik.interfaces.ExtraSessions;

public class OfficeHours implements ExtraSessions {
    @Override
    public int getHours() {
       return 4;
    }
}
