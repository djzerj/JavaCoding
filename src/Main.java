import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your date of birth: MM DD YYYY");
        //LocalDate bDay = LocalDate.of(1979, Month.SEPTEMBER, 13);
        int month = input.nextInt();
        int day = input.nextInt();
        int year  = input.nextInt();
        LocalDate bDay = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        Period age = Period.between(bDay, today);
        int years = age.getYears();
        int months = age.getMonths();
        int days = age.getDays();
        System.out.print("You are " + years + " years ");
        System.out.print(months + " months");
        System.out.print(" and " + days + " days old");
    }
}