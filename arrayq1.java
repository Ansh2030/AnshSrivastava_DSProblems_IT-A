import java.util.*;
class arrayq1
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = ob.nextInt();
        int ar[]= new int[n];
        System.out.println("entr the elements");
        for( int i = 0;i<n;i++)
        ar[i]= ob.nextInt();

        // trversing and printing array elements
        for(int i = 0;i<n;i++)
        System.out.print(" "+ar[i]);
        
    }
}