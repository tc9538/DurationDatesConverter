import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class DurationDatesConverter {

    public static void DurationCalculator(String s1, String s2)
    {
        int inputBeginMonth = Integer.parseInt(s1.substring(0,2));
        int inputBeginDay = Integer.parseInt(s1.substring(3,5));
        int inputBeginYear = Integer.parseInt(s1.substring(6,8));
        LocalDate beginDate = LocalDate.of(inputBeginYear, inputBeginMonth, inputBeginDay);

        int inputEndMonth = Integer.parseInt(s2.substring(0,2));
        int inputEndDay = Integer.parseInt(s2.substring(3,5));
        int inputEndYear = Integer.parseInt(s2.substring(6,8));
        LocalDate endDate = LocalDate.of(inputEndYear, inputEndMonth, inputEndDay);
        Period p = Period.between(beginDate, endDate);
        //This doesn't include the begin date and the end date in the range
        //To include those days, need to add 2 (optional)
        System.out.println(p.getYears() + " years, " +  p.getMonths() + " months, "  + p.getDays() + " days.");

    }
    public static void main (String[] args) throws ParseException {
        System.out.println("Enter begin date");
        Scanner s = new Scanner(System.in);
        String inputBeginDate = s.next();

        System.out.println("Enter end date");
        String inputEndDate = s.next();

        DurationDatesConverter.DurationCalculator(inputBeginDate, inputEndDate);

    }
}
