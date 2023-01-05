import java.util.*;
public class letterGradeToNumber 
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter the letter grade: ");
        String theGrade = kb.nextLine().toUpperCase();
        char newChar = theGrade.charAt(0);
        if(letterToGrade(newChar) == -1)
        System.out.println(newChar + " is invalid grade.");
        else
        System.out.println("The numeric value for grade "+newChar+" is "+letterToGrade(newChar));
        kb.close();
    }
    public static int letterToGrade(char grade)
    {
        int numberGrade = 0;
        if (grade == 'A')
        numberGrade = 4;
        else if (grade == 'B')
        numberGrade = 3;
        else if (grade == 'C')
        numberGrade = 2;
        else if (grade == 'D')
        numberGrade = 1;
        else if (grade == 'F')
        numberGrade = 0;
        else
        numberGrade = -1;

        return numberGrade;

    }
    
}
