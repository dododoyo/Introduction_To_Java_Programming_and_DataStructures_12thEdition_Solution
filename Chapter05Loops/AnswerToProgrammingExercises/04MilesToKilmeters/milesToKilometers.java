public class milesToKilometers 
{
    public static void main(String[] args)
    {
        System.out.println("Miles \t Kilometers");
        for (int i = 1 ; i < 11 ; i++)
        {
            System.out.printf(i + "\t %.3f\n",(float)i*1.609);
        }
    }

}
