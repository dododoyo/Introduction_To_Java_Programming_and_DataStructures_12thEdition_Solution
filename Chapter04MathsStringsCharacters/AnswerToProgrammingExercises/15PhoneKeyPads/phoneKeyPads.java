import java.util.*;
public class phoneKeyPads 
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String theLetter = kb.nextLine().toLowerCase();
        char theCharacter = theLetter.charAt(0);

        if(convertToNumber(theCharacter) != -1)
        System.out.println("The corresponding number is "+convertToNumber(theCharacter));
        else
        System.out.println(theCharacter + " is an invalid input.");
        kb.close();
    }
    public static int convertToNumber(char theLetter)
    {
        int theNumber;
        if (theLetter == 'a' || theLetter == 'b' || theLetter == 'c')
        theNumber = 2;
        else if (theLetter == 'd' || theLetter == 'e' || theLetter == 'f')
        theNumber = 3;
        else if (theLetter == 'g' || theLetter == 'h' || theLetter == 'i')
        theNumber = 4;
        else if (theLetter == 'j' || theLetter == 'k' || theLetter == 'l')
        theNumber = 5;
        else if (theLetter == 'm' || theLetter == 'n' || theLetter == 'o')
        theNumber = 6;
        else if (theLetter == 'p' || theLetter == 'q' || theLetter == 'r'|| theLetter == 's')
        theNumber = 7;
        else if (theLetter == 't' || theLetter == 'u' || theLetter == 'v')
        theNumber = 8;
        else if (theLetter == 'w' || theLetter == 'x' || theLetter == 'y'|| theLetter == 'z')
        theNumber = 9;
        else 
        theNumber = -1;

        return theNumber;
    }
    
}
