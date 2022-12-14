package it.develhope.dateTime1;
import java.time.LocalDate;
import java.time.Year;

public class Main {
    public static void main(String[] args) {

       LocalDate today = LocalDate.now();
        System.out.println("Days left till the end of the month: " + (today.lengthOfMonth() - today.getDayOfMonth() ));


        System.out.println("Days left till the end of the year: " + (Year.of(today.getYear()).length() - today.getDayOfYear()));


    }
}
