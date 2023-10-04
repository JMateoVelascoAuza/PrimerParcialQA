package Ejercicio3;

import Ejercicio2.AirlineServiceUtils;

public class AirlineService {
    public String bookFlight (String destination , int quantity, int day, int month, int year) {


        if (AirlineServiceUtils.areTicketsAvailable(destination, quantity)) {

            String weekday = AirlineServiceUtils.getWeekday(day, month, year);

            String monthText = convertMonthToText(month);
            return String.format("On %s %d %s %d, thre are %d tickets avialable for %s", weekday, day, monthText, year, quantity, destination);
        }else{
            return String.format("There are not enough tickets available for %s", destination);


    }

    }

    private String convertMonthToText (int month) {
        String[] months = {
                "January", "February", "March", "April", "May","June","July","August","September","October",
                "November","December",
        };

        return months[month - 1];



    }



}
