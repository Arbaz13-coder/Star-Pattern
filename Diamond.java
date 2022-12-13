public class Diamond {
    public static void main(String[] args) {

        int n = 7;
        int star = 1;
        int space = n/2;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=space; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");

            }
            System.out.println();
            if (i<=n/2){
                star = star +2;
                space--;
            } else {
                star = star - 2;
                space ++;
            }

        }
    }
}
