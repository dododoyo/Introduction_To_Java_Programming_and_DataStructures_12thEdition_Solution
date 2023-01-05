import java.util.*;
public class hexToBinary 
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String theDigit = kb.nextLine().toUpperCase();
        char theDigitChar = theDigit.charAt(0);
        showBinary(theDigitChar);
        kb.close();
    }
    public static void showBinary(char hexa)
    {
        boolean isHexaDecimal = true;
        String binary = "0000";

        if(hexa == 0)
        binary = "0000";
        else if (hexa == '1')
        binary = "0001";
        else if (hexa == '2')
        binary = "0010";
        else if (hexa == '3')
        binary = "0011";
        else if (hexa == '4')
        binary = "0100";
        else if (hexa == '5')
        binary = "0101";
        else if (hexa == '6')
        binary = "0110";
        else if (hexa == '7')
        binary = "0111";
        else if (hexa == '8')
        binary = "1000";
        else if (hexa == '9')
        binary = "1001";
        else if (hexa == 'A')
        binary = "1010";
        else if (hexa == 'B')
        binary = "1011";
        else if (hexa == 'C')
        binary = "1100";
        else if (hexa == 'D')
        binary = "1101";
        else if (hexa == 'E')
        binary = "1110";
        else if (hexa == 'F')
        binary = "1111";
        else 
        isHexaDecimal = false;
        
        if(isHexaDecimal)
        System.out.println("The binary value is "+binary);
        else
        System.out.println(hexa+" is and invalid input");
        
    }
    
}
