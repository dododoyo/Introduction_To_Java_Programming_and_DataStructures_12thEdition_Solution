public class divisibleBy5and6ButNotBoth 
{
    public static void main(String args[])
    {
        System.out.println("This are all the numbers that are divisible by 10.\n");
        int numsCounter =0;
        for(int i = 100 ; i < 201 ; i++)
        {
            if((i%5 == 0 || i%6 == 0)&& i%30 != 0) // divisible by both 5 and 6 implies divisible by 30.
            {
                if(numsCounter++%10 == 0)
                {
                    System.out.println();
                    System.out.print(i+"  ");
                }
                else
                System.out.print(i+"  ");
                
            }
        }
    }
}
