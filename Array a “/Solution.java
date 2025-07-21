
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int even = 0, odd = 0;

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

        sc.close();
    }
}
