package com.kata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TimeTest {

    @Test
    public void should_0_days(){
        Tamagotchi tamagotchi = new Tamagotchi();

        TimeDays result = tamagotchi.checking_days();

        assertEquals(result.getDays(), 0);
    }
}
