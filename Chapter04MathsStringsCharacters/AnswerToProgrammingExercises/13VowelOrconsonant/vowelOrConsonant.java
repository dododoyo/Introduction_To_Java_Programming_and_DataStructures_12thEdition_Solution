import java.util.*;
public class vowelOrConsonant 
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String theChar = kb.nextLine().toUpperCase();
        char theReal = theChar.charAt(0);
        if(Character.isLetter(theReal))
        {
            if(isVowel(theReal))
            System.out.println(theReal+" is a vowel");
            else
            System.out.println(theReal+" is a consonant.");
        }
        else
        System.out.println(theReal+" is an invalid input.");
        kb.close();

    }
    public static boolean isVowel(char letter)
    {
        if ( letter == 'A'|| letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
        return true;
        else 
        return false;

    }
    
}
