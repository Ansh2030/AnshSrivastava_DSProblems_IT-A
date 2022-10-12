import java.util.*;
public class arrayq5 {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the range");
        int n = ob.nextInt();
        int m = ob.nextInt();
        int ar[]= new int[m-n];
        System.out.println("enter the elements");
        for( int i = 0;i<m-n;i++)
        ar[i]= ob.nextInt(); int pos=0; 
        //to check mising number in 
        System.out.println("Missing elements "); int t = m-n;
        for(int i= n;i<=m;i++)
    {   int c=0;
        for(int j = 0;j<t;j++)
        {
            if(ar[j]==i)
             c=1;
             else
             continue;
        }

        if(c==0)
      {System.out.print(i+" ");
       pos=1;}
    }
    if(pos==0)
    System.out.println("No missing element");
}
}
