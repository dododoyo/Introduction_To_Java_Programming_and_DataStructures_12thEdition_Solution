import java.util.*;
public class studentMajorAndStatus 
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String characters = kb.nextLine().toUpperCase();
        char firstCharacter = characters.charAt(0);
        char secondCharacter = characters.charAt(1);

        if(getMajor(firstCharacter) == " " || getStatus(secondCharacter)==" ")
        System.out.println("Invalid Input");
        else
        System.out.println(getMajor(firstCharacter)+" "+getStatus(secondCharacter));
        kb.close();
    }
    public static String getMajor(char character)
    {
        if(character == 'M')
        return "Mathematics";
        else if (character == 'C')
        return "Computer Science";
        else if (character == 'I')
        return "Information Technology";
        else return " ";
    }
    public static String getStatus(char statusChar)
    {
        if(statusChar == '1')
        return "Freshman";
        else if(statusChar == '2')
        return "Sophomore";
        else if(statusChar == '3')
        return "Junior";
        else if (statusChar == '4')
        return "Senior";
        else 
        return " ";
    }
    
}
