import java.util.*;
public class daysOfMonth 
{
    public static void main(String[] args)
    {
       Scanner kb = new Scanner(System.in);
       System.out.print("Enter a year: ");
       int year = kb.nextInt();
       kb.nextLine();
       System.out.print("Enter a month:"); 
       String month = kb.nextLine();
       System.out.println();

       if (isMonthName(month))
       System.out.println(month + " " + year+" has " +getMonthDay(isLeapYear(year), month, year)+" days.");
       else
       System.out.println(month + " is not a correct month name.");
       kb.close();

    }
    public static boolean isLeapYear(int year)
    {
        if(year % 400 == 0)
        return true;

        else if (year%100 == 0)
        return false;

        else if (year%4 == 0)
        return true;

        else 
        return false;
    }
    public static int getMonthDay(boolean ifLeap, String monthName,int year)
    {
        int days = 0;
        if(monthName.equals("Jan"))
        days =  31;
        else if (monthName.equals("Feb") && isLeapYear(year))
        days = 29;
        else if (monthName.equals("Feb") && !isLeapYear(year))
        days = 28;
        else if (monthName.equals("Mar"))
        days =  31;
        else if (monthName.equals("Apr"))
        days = 30;
        else if (monthName.equals("May"))
        days = 31;
        else if (monthName.equals("Jun"))
        days = 30;
        else if (monthName.equals("Jul"))
        days = 31;
        else if (monthName.equals("Aug"))
        days = 31;
        else if (monthName.equals("Sep"))
        days = 30;
        else if (monthName.equals("Oct"))
        days = 31;
        else if (monthName.equals("Nov"))
        days = 30;
        else if (monthName.equals("Dec"))
        days = 31;
        return days;
        
    }
    public static boolean isMonthName(String monthName)
    {
        String allMonths = "JanFebMarAprMayJunJulAugSepOctNovDec";
        if (allMonths.contains(monthName))
        return true;
        else 
        return false;
    }
    
}
