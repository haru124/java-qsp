import java.util.*;
public class Karatsuba {
    public static int getKaratsuba(int a,int b)
    {
        if (a<10 || b<10)
            return a*b;
        else
        {
            int slen;
            if(a>b)
                slen = Integer.toString(a).length();
            else
                slen = Integer.toString(b).length();
            if (slen%2!=0) slen++;
            int mid = slen/2;
            int id = (int)Math.pow(10,mid);
            int al,ah,bl,bh;
            al = a%id;
            ah = a/id;
            bl = b%id;
            bh = b/id;
            int p1 = getKaratsuba(ah, bh);
            int p2 = getKaratsuba(al, bl);
            int p3 = getKaratsuba((al+ah),(bl+bh));
            return (p1*id*id)+((p3-p2-p1)*id)+p2;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("The result:"+getKaratsuba(a,b));
        sc.close();
    }
}
