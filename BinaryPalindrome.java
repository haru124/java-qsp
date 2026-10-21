import java.util.*;
public class BinaryPalindrome
{
    
    public static boolean pallindrome(int n)
    {
        String s = Integer.toBinaryString(n);
        int i=0,j = s.length()-1;
        while(i<j)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = input.nextInt();
        System.out.println(pallindrome(n));
        input.close();
    }

}