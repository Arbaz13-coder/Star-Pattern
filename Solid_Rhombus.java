public class Solid_Rhombus {

    public static void main(String[] args) {

        int n = 5;
        int space = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            space--;
            System.out.println();
        }
    }
}
