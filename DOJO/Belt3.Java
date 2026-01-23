import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int evenCount = 0, oddCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) evenCount++;
            else oddCount++;
        }

        int[] even = new int[evenCount];
        int[] odd = new int[oddCount];
        int e = 0, o = 0;

        for (int num : arr) {
            if (num % 2 == 0) even[e++] = num;
            else odd[o++] = num;
        }

        for (int i = 0; i < even.length; i++) System.out.print(even[i] + " ");
        System.out.println();
        for (int i = 0; i < odd.length; i++) System.out.print(odd[i] + " ");

        sc.close();
    }
}