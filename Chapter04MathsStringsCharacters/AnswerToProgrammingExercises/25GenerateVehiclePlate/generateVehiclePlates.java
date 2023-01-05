public class generateVehiclePlates 
{
    public static void main(String[] args)
    {
     
        
        String thePlate="";

        for(int i = 0; i< 3; i++)
        thePlate += (char)((int)(Math.random()*25) + 65);

        for(int j = 0; j<4;j++)
        thePlate += String.valueOf((int)(Math.random()*10));

        System.out.println(thePlate);
    }
    
}
