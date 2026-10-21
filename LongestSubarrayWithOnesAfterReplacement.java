import java.util.Scanner;

class LongestSubarrayWithOnesAfterReplacement {
    
    private static int findMaxConsecutiveOnes(int[] a, int k) {
        int maxOnes = Integer.MIN_VALUE;
        int numReplacements = 0;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < a.length; windowEnd++) {
            if (a[windowEnd] == 0) {
                numReplacements++;
            }
            while (numReplacements > k) {
                if (a[windowStart] == 0) {
                    numReplacements--;
                }
                windowStart++;
            }
            maxOnes = Math.max(maxOnes, windowEnd - windowStart + 1);
        }
        return maxOnes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        int[] a = new int[length];
        
        System.out.println("Enter the elements of the array (0 or 1):");
        for (int i = 0; i < length; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        int result = findMaxConsecutiveOnes(a, k);
        System.out.printf("Length of longest contiguous subarray containing only 1s after replacement = %d%n", result);

        scanner.close();
    }
}
