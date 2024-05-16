import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDate localDate1 =LocalDate.from(ZonedDateTime.now());
        System.out.println(localDate1);
        LocalTime localTime = LocalTime.from(ZonedDateTime.now());
        System.out.println(localTime);
        String s= "1999-12-31";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate2 = LocalDate.now();
        String s1 = localDate2.format(dateTimeFormatter);
        System.out.println(s1);
        LocalDate localDate3 = LocalDate.parse(s);
        String s2= localDate3.format(dateTimeFormatter);
        System.out.println(s2);
        System.out.println(localDate3.isLeapYear());
        //int year =2024 ;
       // if ( ((year % 4 ==0) && (year%100!==0)) || (year % 400==0)) {
          //  System.out.println(year + "true");
        ////} else {
            //System.out.println( year + "false");
        }
    }
