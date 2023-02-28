//Author: Addison Farley
//Date: 1/12/2023
//Program: Constructor Chaining Lab

package alarm;

import java.time.LocalTime;

public class AlarmClock
{
    //class fields
    private LocalTime currentTime;
    private Boolean alarmSet;
    private LocalTime alarm;

    //constructors
    public AlarmClock(LocalTime currentTime, boolean alarmSet, LocalTime alarm)
    {
        this.currentTime = currentTime;
        this.alarmSet = alarmSet;
        this.alarm = alarm;
    }

    public AlarmClock(LocalTime currentTime, LocalTime alarm)
    {
        this(currentTime, false, alarm);
    }

    public AlarmClock(LocalTime currentTime)
    {
        this(currentTime, false, null);
    }

    public AlarmClock()
    {
        this(LocalTime.now(), false, null);
    }

    //getters and setters
    public LocalTime getCurrentTime()
    {
        return currentTime;
    }

    public void setCurrentTime(LocalTime currentTime)
    {
        this.currentTime = currentTime;
    }

    public boolean isAlarmSet()
    {
        return alarmSet;
    }

    public void setAlarmSet(Boolean alarmSet)
    {
        this.alarmSet = alarmSet;
    }

    public LocalTime getAlarm()
    {
        return alarm;
    }

    public void setAlarm(LocalTime alarm)
    {
        this.alarm = alarm;
    }

    //toString
    @Override
    public String toString()
    {
        return "Current time is: " + currentTime + " - Alarm: " + alarm + " - Set: " + alarmSet;
    }
}
