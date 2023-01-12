import java.util.*;
public class additionQuizLoop 
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        final int numberOfQuestions = 10;
        int count = 0, firstNumber = 0, secondNumber = 0,response = 0,correct = 0;
        long startTime = System.currentTimeMillis();
        do
        {
            firstNumber = (int)(Math.random()*14) + 1;
            secondNumber = (int)(Math.random()*14) + 1;
            if (firstNumber >= secondNumber)
            {
                System.out.print(firstNumber+" - "+secondNumber+" = ");
                response = kb.nextInt();
                if (response == firstNumber - secondNumber )
                {
                    System.out.println("You are correct. ");
                    correct++;
                }
                else
                System.out.println("Your answer is wrong \n" +firstNumber+" - "+secondNumber+" should be " + (firstNumber-secondNumber));
                count++;
                

            }
            else
            {
                System.out.print(secondNumber+" - "+firstNumber+" = ");
                response = kb.nextInt();
                if (response == secondNumber - firstNumber)
                {
                    System.out.println("You are correct. ");
                    correct++;
                }
                else
                System.out.println("Your answer is wrong \n" +secondNumber+" - "+firstNumber+" should be " + (secondNumber-firstNumber));
                count++;
            }

        }while(count < numberOfQuestions);
        long endTime = System.currentTimeMillis();
        kb.close();
        long timeTaken = endTime - startTime;

        System.out.println("\nThe number of questions answered correctly is: " + correct);
        System.out.println("Test time is "+ (timeTaken)/1000 + " seconds");
    }    
}
