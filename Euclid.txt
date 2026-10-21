import java.util.*;
public class Euclid {
    public static int getGCD(int a,int b)
    {
        if(b == 0)
            return a;
        else
            return getGCD(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(getGCD(a,b));
        sc.close();
    }
}
