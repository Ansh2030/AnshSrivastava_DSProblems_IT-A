import java.util.*;
public class arrayq3 {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = ob.nextInt();
        int ar[]= new int[n];
        System.out.println("enter the sorted  elements");
        for( int i = 0;i<n;i++)
        ar[i]= ob.nextInt();
        System.out.println("enter the element to insert");
        int a = ob.nextInt(); int k=0;
        

        for(int i =0;i<n;i++)
       { if(ar[i]>a)
        k=i;}
        
        n++;
        int b[]= new int[n];

        for(int i = 0;i<n-1;i++)
        b[i] = ar[i];
        for(int i =k;i<n-1;i++)
        b[i+1]=b[i];
        b[k]= a;
        System.out.println("final array");

        for(int i =0;i<n;i++)
        System.out.println(" "+b[i]);

    }


    
}
