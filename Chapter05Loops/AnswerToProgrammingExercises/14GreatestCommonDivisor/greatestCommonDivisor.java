import java.util.*;
public class greatestCommonDivisor 
{
    public static void main(String args[])
    {
        int firstNumber,secondNumber,minimumOfTwo,gcd=1;
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        firstNumber = kb.nextInt();
        System.out.print("Please enter the second number: ");
        secondNumber = kb.nextInt();

        if(firstNumber >= secondNumber)
        minimumOfTwo = secondNumber;
        else
        minimumOfTwo = firstNumber;
        kb.close();

        for(int i = 1 ; i <= minimumOfTwo ; i++)
        {
            if(firstNumber%i == 0 && secondNumber%i == 0)
            {
                gcd = i;
            }
        }
        System.out.println("The Greatest Common Divisor of the two numbers is: " + gcd);
    }
    
}
