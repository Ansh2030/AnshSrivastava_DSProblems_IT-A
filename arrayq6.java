import java.util.*;

import javax.lang.model.element.Element;
public class arrayq6 {
    
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = ob.nextInt();
        int ar[]= new int[n];
        System.out.println("enter the  elements");
        for( int i = 0;i<n;i++)
        ar[i]= ob.nextInt();
        
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> ap = new ArrayList<>();
        for(int i =0;i<n;i++)
        { int c=0;
            for(int j = i+1;j<n;j++)
            {
                if(ar[j]==ar[i])
                c++;

            }
            if(c>0)
            al.add(ar[i]);
            if(c==0) 
            ap.add(ar[i]);
        }
        
        if(al.size()>0)
        {System.out.println("repeated elements are");
        for(int i = 0;i<al.size();i++)
        System.out.print(al.get(i)+" ");}
        else
        System.out.println("no repeated elements");
        System.out.println();
        if(ap.size()>0)
        {
        System.out.println(" not repeated elements are");
        for(int i = 0;i<ap.size();i++)
        System.out.print(ap.get(i)+" ");
        }
        else
        System.out.println("no non repeated elements");

    }

}
