import java.util.*;


public class searchq3 {
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
        int l=n-1,f=0,m1=0,m2=0;
        while(f<l)
        {
            m1= f+(l-f)/3;m2=l-(l-f)/3;
            if(a[m1]==s)
            {
               System.out.println("element found at pos :"+(m1+1));break;
            }
            else if(a[m2]==s)
            {
                System.out.println("element found at pos :"+(m2+1)); pos=1;break;
            }
            else if(s>a[m2])
            f=m2+1;
            else if(s<a[m1])
            l=m1-1;
            else 
            {
                f=m1+1;l=m2-1;
            }
        }
        if(pos==0)
        System.out.println("element not found");
    }

    
}
