import java.util.*;
class WasteCollection
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("ENTER VEHICLE NUMBER");
        int number = sc.nextInt();

        System.out.println("ENTER THE WASTE COLLECTED(in KG)");
        double collected=sc.nextDouble();

        System.out.println("ENTER THE NUMBER OF  COLLECTION POINTS");
        int points=sc.nextInt();

        System.out.println("VEHICLE STATUS IS");
        char status = sc.next().charAt(0);

        
        System.out.println("VEHICLE NUMBER IS:"+number);
        System.out.println("WASTE COLLECTED IS(in kg)" +collected);
        System.out.println(" NUMBER OF COLLECTION POINTS IS:"+points);
        System.out.println("VEHICLE STATUS IS:"+status);
    
    }

}