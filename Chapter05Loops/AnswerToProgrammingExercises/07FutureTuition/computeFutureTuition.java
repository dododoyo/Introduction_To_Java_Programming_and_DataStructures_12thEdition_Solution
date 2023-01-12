public class computeFutureTuition 
{
    public static void main(String[] args)
    {
        double tuition = 10000;
        for(int i = 0 ; i< 10; i++)
        tuition *= 1.05;

        System.out.printf("The tuition after 10 years will be: %.2f\n",tuition);
        double sumAfter10years = tuition;

        for (int i = 0 ; i<3; i++)
        sumAfter10years += tuition*(1+0.05);

        System.out.printf("The total cost for 4 years is :%.2f\n",sumAfter10years);
    }
    
}
