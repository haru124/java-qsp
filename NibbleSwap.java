import java.util.*;
public class NibbleSwap {
    public static int getSwapNibble(int n)
    {
        return ((n& 0x0F)<<4 | ((n&0XF0)>>4));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getSwapNibble(n));
        sc.close();
    }
}
