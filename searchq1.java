import java.util.*;
public class searchq1 {
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
        for(int i = 0;i<n;i++)
        if(a[i] == s)
        {
            pos=i+1;
            break;
        }
        if(pos>0)
        System.out.println("element found at position "+pos);
        else
        System.out.println("element not found");
    }
    
    
}
