public class Hollow_Diamond {

    public static void main(String[] args) {
        int n = 7;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j == 5) || (i - j == 3) || (j - i == 3) || (i + j == 11)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
