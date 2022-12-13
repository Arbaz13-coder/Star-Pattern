public class Inverted_K {

    public static void main(String[] args) {

        int n = 7;
        int space = 0;
        int star = n / 2 + 1;// its for my convenience you can take *star = 4*
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i <= n / 2) {
                space++;
                star--;
            } else {
                space--;
                star++;
            }
        }

    }
}
