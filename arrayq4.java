import java.util.*;
public class arrayq4 {
    public static void main(String args[])
    {
    Scanner ob = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = ob.nextInt();
        int ar[]= new int[n];
        System.out.println("enter the sorted  elements");
        for( int i = 0;i<n;i++)
        ar[i]= ob.nextInt();
        System.out.println("enter the element to delete");
        int a = ob.nextInt(); 

        for(int i = 0;i<n;i++)
        {
            if(ar[i]==a)
            {
                for(int j = i;j<n-1;j++)
                {
                    ar[j]=ar[j+1];
                }
                n--;
            }
        }
        System.out.println("final array");

        for(int i =0;i<n;i++)
        System.out.println(" "+ar[i]);


    }
        
    
}
