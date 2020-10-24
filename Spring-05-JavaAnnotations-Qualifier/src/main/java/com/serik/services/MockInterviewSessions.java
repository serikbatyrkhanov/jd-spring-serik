package com.serik.services;

import com.serik.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class MockInterviewSessions implements ExtraSessions {
    @Override
    public int getHours() {
        return 9;
    }
}
