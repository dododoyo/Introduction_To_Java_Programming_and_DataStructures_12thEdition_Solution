import java.util.*;
public class findHighestScore 
{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);
        String highestName = "" ,  eachName;
        int highestScore=0,numberOfStudents,eachScore;
        System.out.print("Please enter the number of students: ");
        numberOfStudents = kb.nextInt(); 
        kb.nextLine();
        
        for(int i = 0 ; i < numberOfStudents ; i++)
        {
            System.out.print("\nPlease enter the name of student "+(i+1)+" : ");
            eachName = kb.nextLine();
            System.out.print("Please enter the score of the student "+(i+1)+" : ");
            eachScore = kb.nextInt();
            kb.nextLine();
            if (eachScore > highestScore)
            {
                highestScore = eachScore;
                highestName = eachName;
            }
        }
        kb.close();
        System.out.println("\nThe name of the student with the highest score is: " + highestName);
        System.out.println("With a high score of "+highestScore);
    }
    
}
