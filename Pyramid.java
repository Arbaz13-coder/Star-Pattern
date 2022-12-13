public class Pyramid {
    public static void main(String[] args) {

        int n = 5;
        // int star = 1;
        int space = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
            space--;
        }

    }
}
