import java.util.Scanner;

class StrongNosWithinN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The integer : ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            boolean rs = isStrong(i);
            if (rs)
                System.out.print(i + " ");
        }
    }

    static boolean isStrong(int x) {
        int sum = 0, y = x;
        do {
            int d = x % 10;
            sum = sum + facto(d);
            x = x / 10;
        } while (x != 0);
        if (sum == y)
            return true;
        else
            return false;
    }

    static int facto(int z) {
        int f = 1;
        while (z > 1) {
            f = f * z;
            z--;
        }
        return f;
    }
}
