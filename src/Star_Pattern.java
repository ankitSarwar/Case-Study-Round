public class Star_Pattern {
    public static void main(String[] args) {

        int numberOfRows = 6;

        int i, j;

        for (i = 1; i <= numberOfRows; i++) {
            for (j = 1; j <= numberOfRows - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (i = numberOfRows - 1; i > 0; i--) {
            for (j = 1; j <= numberOfRows - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
