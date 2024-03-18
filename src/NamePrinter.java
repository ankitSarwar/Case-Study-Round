

public class NamePrinter {

    public static void main(String[] args) {
        String name = "SANDEEP";

//        for (int i = 0; i < name.length(); i++) {
//            System.out.println(name.substring(0, name.length() - i)+" ");
//        }

        int n = name.length();

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(name.charAt(j)+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(name.charAt(j) + " ");
            }
            System.out.println();
        }
    }
}

