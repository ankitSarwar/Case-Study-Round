public class PatternPrinter {

    public static void main(String[] args) {
        printPattern(6);
        printPattern(1);
        printPattern(4);
        printPattern(3);
        printPattern(1);
        printPattern(2);
    }

    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        if (n != 1) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2 * (n - i - 1) - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("*");
        }
    }
}
