public class smallestNSquared 
{
    public static void main(String args[])
    {
        int n = 200 ; 
        // we assumed n to be less than 200 becuase square of 200 is also less than 12,000
        while(Math.pow(n,2) > 12000)
        {
           n--;
        }
        System.out.println("The smallest 'n' such that n^2 is larger than 12,000 is :"+ (n+1));

        /*We can also use the following code to find n
          while(Math.pow(n--,2) > 12000){}
          but we must show n+2 to the user.  Guess Why??

         */
    }
    
    
}
