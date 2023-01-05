import java.util.*;
public class findUnicodeOfCharacter 
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter a character: ");
        String theChar = kb.nextLine();
        char newChar = theChar.charAt(0);
        int unicode = (int) newChar;
        System.out.println("The Unicode for the character "+newChar+" is "+unicode);
        kb.close();
    }
    
}
