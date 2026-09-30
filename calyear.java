import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class calyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter birth date
        System.out.print("Enter day of birth: ");
        int day = input.nextInt();

        System.out.print("Enter month of birth: ");
        int month = input.nextInt();

        System.out.print("Enter year of birth: ");
        int year = input.nextInt();

        // Birth date
        LocalDate birthDate = LocalDate.of(year, month, day);

        // Today's date
        LocalDate today = LocalDate.now();

        // Calculate years, months, days
        Period period = Period.between(birthDate, today);

        // Total number of days lived
        long totalDays = ChronoUnit.DAYS.between(birthDate, today);

        // Total hours lived
        long totalHours = totalDays * 24;

        // Output results
        // System.out.println("\n--- Results ---");
        System.out.println("Years lived: " + period.getYears());
        System.out.println("Additional months: " + period.getMonths());
        System.out.println("Additional days: " + period.getDays());
        System.out.println("Total days lived: " + totalDays);
        System.out.println("Total hours lived: " + totalHours);
    }
}