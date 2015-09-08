package com.example.asiman.lessons;


import java.util.Calendar;

public class GetWeekAndDay {

    public static int getWeek(){
        Calendar calendar = Calendar.getInstance();
        int num = calendar.get(Calendar.WEEK_OF_MONTH);
        return num;
    }

    public static int getDay(){
        Calendar calendar = Calendar.getInstance();
        int num = calendar.get(Calendar.DAY_OF_WEEK);

        return num;
    }

    public static boolean flag(){
        int getWeek = getWeek();
        boolean flag;
        if(getWeek%2 == 0)
            flag = true;
        else
            flag = false;
        return flag;
    }

}
