public class kiloToPoundInterconversion 
{
    public static void main(String[] args)
    {
        System.out.println("Kilograms\tPounds   |   Pounds\tKilograms");
        for (int i = 1 ,j = 20; i<200;i+=2,j += 5)
        {
            System.out.print(i);
            System.out.printf("\t\t%.1f\t |   ",(float)i*2.2);
            System.out.print(j);
            System.out.printf("\t\t %.2f\n",(float)(j/2.2));
        }
    
    }
}
