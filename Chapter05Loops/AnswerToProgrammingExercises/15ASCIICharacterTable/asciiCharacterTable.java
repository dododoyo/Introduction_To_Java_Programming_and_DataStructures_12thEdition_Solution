public class asciiCharacterTable 
{
    public static void main(String args[])
    {
        int counter = 0 ;
        for (int i = 33  ; i < 127 ; i++)
        {
            if (counter % 10 == 0)
            {
                System.out.println();
                System.out.print((char)i+"  ");
            }
            else
            System.out.print((char)i+"  ");

            counter++;
        }
    }
    
}
