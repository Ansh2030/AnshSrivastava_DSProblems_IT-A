import java.util.*;//binary search
public class searchq2 {
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
        int s = ob.nextInt();
        int f=0,l=n-1; int mid=0;
        while(f<l)
        {
            mid=(f+l)/2;
            if(a[mid]==s)
            {
                System.out.println("element found at position : "+(mid+1));
                break;
            }
            if(a[mid]>s)
            l=mid-1;
            if(a[mid]<s)
            f=mid+1;
        }
    }


    
}
