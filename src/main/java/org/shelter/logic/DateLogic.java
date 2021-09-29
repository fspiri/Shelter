package org.shelter.logic;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateLogic {

    public long calculateDateDifference(Date initialDate){
        Date todayDate = new Date();
        long diffInMillies = Math.abs(todayDate.getTime() - initialDate.getTime());
        long diffInDays = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        return diffInDays;
    }

}
