import java.util.*;
public class countPositiveAndNegatives
{
    
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter an integer. the input ends if if is 0: ");
        int num = 1,sum = 0,postives=0,negatives = 0;
        while (num != 0)
        {
            sum += num;
            if(num > 0)
            postives++;
            else
            negatives++;
            num = kb.nextInt();
        }
        kb.close();
        // Getting the real sum and positives
        sum--;
        postives--;
        
        float average = (float)((float)sum/(postives+negatives));

        System.out.println("The number of positives is "+postives);
        System.out.println("The number of negatives is " + negatives);
        System.out.println("The total is "+(float)sum);
        System.out.println("The average is "+ average);

    }
}