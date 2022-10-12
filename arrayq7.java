import java.util.*;
public class arrayq7 {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = ob.nextInt();
        int ar[]= new int[n];
        System.out.println("enter the  elements");
        for( int i = 0;i<n;i++)
        ar[i]= ob.nextInt();

        for(int i =0;i<n;i++)
        {
            if(i<n-i)
            {int s = ar[i]+ar[n-1-i];
            ar[i]= s-ar[i];
            ar[n-i-1]=s-ar[n-i-1];}
            else
            break;
        }
        System.out.println("final array");

        for(int i =0;i<n;i++)
        System.out.println(" "+ar[i]);
    }

}
