package PatternUsingForLoop.Piramid;

public class Piramid5 {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 1; i <= (n / 2) + 1; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print(j % 2 + " ");
            System.out.println();
        }
    }
}