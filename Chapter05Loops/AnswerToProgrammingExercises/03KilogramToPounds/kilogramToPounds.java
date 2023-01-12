public class kilogramToPounds 
{
    public static void main(String[] args)
    {
        System.out.println("Kilograms \tPounds");
        for (int i = 1 ; i < 200 ; i = i+2)
        {
            System.out.print(i);
            System.out.printf("\t\t%.1f\n",(float)i*2.2);
        }
    }
    
}
