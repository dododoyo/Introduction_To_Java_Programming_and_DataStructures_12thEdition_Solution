public class milesToKilometersInter 
{
    public static void main(String[] args)
    {
        for (int i = 1 ,j = 20; i<11;i++,j += 5)
        {
            System.out.print(i);
            System.out.printf("\t\t%.3f\t |   ",(float)i*1.609);
            System.out.print(j);
            System.out.printf("\t\t %.3f\n",(float)(j/1.609));
        }
    }
    
}
