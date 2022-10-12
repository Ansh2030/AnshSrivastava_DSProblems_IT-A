import java.util.*;
public class adcalq15 {
    public static void main(String args[])
    {
        Scanner ob= new Scanner(System.in);
        System.out.println("enter the word size");
        int w = ob.nextInt();
        System.out.println("enter the order of 3d matrix");
        int l1= ob.nextInt();
        int l2= ob.nextInt();
        int l3= ob.nextInt();
        System.out.println("entr the index for getting adress");
        int i= ob.nextInt();
        int j= ob.nextInt();
        int k= ob.nextInt();
        int ba= 200;
        int e1= i;int e2= j;int e3=k;
        int ad = ba+w*(e1*l2*l3+e2*l3+e3);
        System.out.println(ad);



    }
}
