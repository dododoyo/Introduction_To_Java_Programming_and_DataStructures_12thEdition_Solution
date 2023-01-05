import java.util.*;
public class lengthAndFirstChar 
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter some string: ");
        String theString = kb.nextLine();
        System.out.println("\nThe length of the string is: "+theString.length());
        System.out.println("The first character of the string is: "+ theString.charAt(0));
        kb.close();
    }
    
}
