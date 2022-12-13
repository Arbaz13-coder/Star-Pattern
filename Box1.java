
public class Box1 {
    public static void main(String[] args) throws InterruptedException {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == 1 || i == n || j == 1 || j == n || i==j || i+j == n+1)) {
                    System.out.print("* ");

                } else {
                    System.out.print("  ");
                }
                Thread.sleep(100);

            }
            System.out.println();

        }
    }
}

