public class randomCharacter 
{
    public static void main(String[] args)
    {
        int randomNumber = (int)(Math.random()*25) + 65 ;//Specifing the range
        char randomChar = (char)randomNumber;
        System.out.println("The random character is: " + randomChar);
    }
    
}
