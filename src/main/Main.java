//Author: Addison Farley
//Date: 1/12/2023
//Program: Constructor Chaining Lab

package main;

import alarm.AlarmClock;
import java.time.LocalTime;

public class Main
{
    public static void main(String[] args)
    {
        //Create different class objects to test the constructors
        AlarmClock clock1 = new AlarmClock(LocalTime.of(20,16), true,
                LocalTime.of(06,30));
        AlarmClock clock2 = new AlarmClock(LocalTime.of(16,43),
                LocalTime.of(06,30));
        AlarmClock clock3 = new AlarmClock(LocalTime.of(18,58));
        AlarmClock clock4 = new AlarmClock();

        //Print them out
        System.out.println(clock1);
        System.out.println(clock2);
        System.out.println(clock3);
        System.out.println(clock4);
    }
}