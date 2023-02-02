package com.kata;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimeDays {
        public static void main(String[] args) {
            Date date = new Date();
            int days=0;

            Timer timer = new Timer();
            System.out.println("Stop Watch Started.");
            timer.scheduleAtFixedRate(new RepeatedTask(), 500, 1000);
        }
    
        static class RepeatedTask extends TimerTask {
            public void run() {
                System.out.println("Running!");
            }
        }
    }

    public TimeDays() {
    }

    public int convertToDays(){
        return days;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

}
