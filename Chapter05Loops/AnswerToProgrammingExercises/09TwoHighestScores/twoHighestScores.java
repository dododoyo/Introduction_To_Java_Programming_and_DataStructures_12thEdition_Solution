import java.util.*;
public class twoHighestScores 
{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);
        String highestName = "" ,  eachName, secondHighestName = "", tempName;
        int highestScore=0, secondHighestScore=0 , numberOfStudents , eachScore,tempScore;
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
                tempName = highestName;//storing the old highest name
                tempScore = highestScore;//storing the old highes score

                highestScore = eachScore;
                highestName = eachName;

                secondHighestName = tempName;
                secondHighestScore = tempScore;
            }
        }
        kb.close();
        System.out.println("\nThe name of the student with the highest score is: " + highestName);
        System.out.println("With a high score of "+highestScore);

        System.out.println("\nThe name of the student with the second highest score is: "+secondHighestName);
        System.out.println("With second highest score of: "+secondHighestScore);
    }
    
    
}
