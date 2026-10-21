import java.util.*;

class Banana {
    public static boolean isPalindrome(String x) {
        for (int i = 0, j = x.length() - 1; i < (x.length() / 2); i++, j--) {
            if (x.charAt(i) != x.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static  Set<String> getPalindrome(String s,  Set<String> res, int ind, String cur) {
        if (ind >= s.length()) {
            return res; // Base case: stop recursion when index exceeds string length
        }


        cur = ""; // Reset cur for new starting index
        for (int i = ind; i < s.length(); i++) {
            cur += s.charAt(i);
            if (isPalindrome(cur) && cur.length()>1) {
                res.add(cur);
                System.out.println(cur);
            }
        }

        // Recurse with the next starting index
        getPalindrome(s, res, ind + 1, cur);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Input: " + s);
        Set<String> res = new HashSet<>();
        getPalindrome(s, res, 0, "");
        ArrayList<String> sarr = new ArrayList<>(res);
        Collections.sort(sarr);
        //res = sort(res);
        System.out.println("List of palindromes in the word " +s+ " : "+res);
        System.out.println("Sorted list of palindromes in the word " +s+ " : "+sarr);
    }
}
