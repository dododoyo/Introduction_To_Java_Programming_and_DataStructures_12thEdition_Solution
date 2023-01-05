import java.util.*;
public class financialApplication 
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Please enter employee name: ");
        String name = kb.nextLine();

        System.out.print("Please enter number of hours worked: ");
        int hoursWorked = kb.nextInt();

        System.out.print("Please enter hourly payrate: ");
        double payRate = kb.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double federalRate = kb.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double stateRate = kb.nextDouble();

        kb.close();

        double federalRateInPercent = federalRate*100;
        double stateRateInPercent = stateRate*100;

        double totalPay = payRate*hoursWorked;
        double federalWithholding = federalRate*totalPay;
        double stateWithholding = stateRate*totalPay;
        double totalDeduction = federalWithholding+stateWithholding;
        double netPay = totalPay - totalDeduction;

        System.out.println("Employee Name: "+ name);
        System.out.printf("Hours Worked: %.1f\n",(float)hoursWorked);
        System.out.printf("Pay Rate: $%.2f\n", payRate);
        System.out.printf("Gross Pay: $%.2f\n",totalPay);
        System.out.println("Deductions: ");
        System.out.printf("\t Federal Withholding (%.1f%%): $%.2f\n",federalRateInPercent,federalWithholding);
        System.out.printf("\t State Withholding (%.1f%%): $%.2f\n",stateRateInPercent,stateWithholding);
        System.out.printf("\t Total Deduction: $%.2f\n",totalDeduction);
        System.out.printf("Net Pay: $%.2f",netPay);
    }
    
}
