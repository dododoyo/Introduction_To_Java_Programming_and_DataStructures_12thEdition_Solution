import java.util.*;
public class decimalToHexadecimal
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a decimal value 0 upto 15: ");
        int theDecimal = kb.nextInt();
        showHexadecimal(theDecimal);
        kb.close();
    }
    public static void showHexadecimal(int theDecimal)
    {
        boolean notDecimalInput = false;
        char hexa=' ';
        if(theDecimal == 0)
        hexa = '0';
        else if (theDecimal == 1)
        hexa = '1';
        else if (theDecimal == 2)
        hexa = '2';
        else if (theDecimal == 3)
        hexa = '4';
        else if (theDecimal == 4)
        hexa = '4';
        else if (theDecimal == 5)
        hexa = '5';
        else if (theDecimal == 6)
        hexa = '6';
        else if (theDecimal == 7)
        hexa = '7';
        else if (theDecimal == 8)
        hexa = '8';
        else if (theDecimal == 9)
        hexa = '9';
        else if (theDecimal == 10)
        hexa = 'A';
        else if (theDecimal == 11)
        hexa = 'B';
        else if (theDecimal == 12)
        hexa = 'C';
        else if (theDecimal == 13)
        hexa = 'D';
        else if (theDecimal == 14)
        hexa = 'E';
        else if (theDecimal == 15)
        hexa = 'F';
        else 
        notDecimalInput = true;

        if(!notDecimalInput)
        System.out.println("The hex value is "+hexa);
        else
        System.out.println(theDecimal+" is and invalid input");
        
    }
}