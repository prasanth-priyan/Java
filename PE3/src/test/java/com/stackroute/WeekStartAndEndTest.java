package com.stackroute;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class WeekStartAndEndTest {

    private Date start;
    private Date end;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("E dd/MM/YYYY");


    @Test
    public void getStartAndEndDate_currentWeekDayGiven_ShouldDisplayOutput(){
        start = new Date("09/08/2019");
        end = new Date("09/14/2019");
        assertArrayEquals("Incorrect Output", new String[]{ dateFormat.format(start), dateFormat.format(end)},WeekStartAndEnd.getStartAndEnd(new Date()));
    }

    @Test
    public void getStartAndEndDate_anyWeekDayGiven_ShouldDisplayOutput(){
        start = new Date("03/03/1970");
        end = new Date("03/09/1970");
        assertArrayEquals("Incorrect Output", new String[]{ dateFormat.format(start), dateFormat.format(end)},WeekStartAndEnd.getStartAndEnd(new Date("03/07/1970")));
    }

}
