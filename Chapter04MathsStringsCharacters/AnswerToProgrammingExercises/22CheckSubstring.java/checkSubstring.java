import java.util.*;
public class checkSubstring 
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Please enter string 1: ");   
        String string1 = kb.nextLine();
        System.out.print("Please enter string 2: ");
        String string2 = kb.nextLine(); 
        kb.close();

        if (string1.contains(string2))
        System.out.println(string2+" is a substring of "+string1);
        else
        System.out.println(string2+" is not a substring of "+string1);

    }
    

}
