import java.util.*;
class WasteCollection2
{
    public static void main(String[]args){

    Scanner sc=new Scanner(System.in);
     System.out.println("ENTER THE TOTAL WASTE COLLECTED(in kgs)");
     double collected=sc.nextDouble();

     if(collected>100)
    {
        System.out.println("Collection Target Achieved");
    }
    else
    {
         System.out.println("More Waste Collection Required");
    }
    
    }

}