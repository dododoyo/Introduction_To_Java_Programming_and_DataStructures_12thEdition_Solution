import java.util.*;
public class findCharacterOfASCII 
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter the ASCII code: ");
        int theCode = kb.nextInt();
        char theCharacter = (char)theCode;
        System.out.println("The character for ASCII code 69 is " + theCharacter);
        kb.close();
    }
    
}
