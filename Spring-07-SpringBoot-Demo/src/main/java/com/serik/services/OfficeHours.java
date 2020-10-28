package com.serik.services;

import com.serik.intefaces.ExtraSession;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSession {
    @Override
    public int getHour() {
        return 5;
    }
}
