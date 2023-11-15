import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public void calculateAge(){
        Scanner input = new Scanner(System.in);
        System.out.println("What's your date of birth: MM DD YYYY");
        int month = input.nextInt();
        int day = input.nextInt(); // if == 1 days, "day", == 0, ""
        int year  = input.nextInt();
        LocalDate bDay = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        Period age = Period.between(bDay, today);
        int years = age.getYears();
        int months = age.getMonths();
        int days = age.getDays();
        String dayText = "";
        if(days > 1 || days == 0){
            dayText = "days";
        } else if(days == 1){
            dayText = "day";
        }
        System.out.printf("You have experienced %d years, %d months and %d days of life.", years, months, days, dayText);
    }
}
