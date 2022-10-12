import java.util.*;
public class searchq4 {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the size");
        int n = ob.nextInt();
        int a[] = new int[n];
        System.out.println("enter the  elements");
        for(int i = 0;i<n;i++)
        a[i]= ob.nextInt();

        System.out.println("enter the search elements");
        int s = ob.nextInt(); int pos = 0;
        int st=0; int end=(int)Math.sqrt(n);
        while(a[end]<s&&st<n)
        {
            st=end;
            end=end+(int)Math.sqrt(n);
            if(end>n-1)
            end=n;
        }

        for(int i = st;i<end;i++)
        {
            if(a[i]==s)
            {System.out.println("element found at pos :"+(i+1)); pos=1;}

        }
        if(pos==0)
        System.out.println("element not found");
    }

    
}
