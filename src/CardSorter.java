import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CardSorter {

    public static void main(String[] args) {
        List<String> sandeep = Arrays.asList("SH2", "SH5", "SCI", "SD4");
        List<String> ramesh = Arrays.asList("RD10", "RC5", "RDI", "RS4");
        List<String> pack = Arrays.asList("RD10", "RC5", "RDI", "RS4", "SH2", "SH5", "SCI", "SD4", "SH2", "SH5", "SCI", "SD4");


        Collections.sort(pack, new Comparator<String>() {
            @Override
            public int compare(String card1, String card2) {
                char color1 = card1.charAt(0);
                char color2 = card2.charAt(0);
                return getColorOrder(color1) - getColorOrder(color2);
            }

            private int getColorOrder(char color) {
                if (color == 'S') {
                    return 1;
                } else if (color == 'H') {
                    return 2;
                } else if (color == 'D') {
                    return 3;
                } else if (color == 'C') {
                    return 4;
                } else {
                    return Integer.MAX_VALUE;
                }
            }
        });

        Collections.sort(pack, new Comparator<String>() {
            @Override
            public int compare(String card1, String card2) {
                String number1 = card1.substring(2).replaceAll("[^\\d]", "");
                String number2 = card2.substring(2).replaceAll("[^\\d]", "");

                if (number1.isEmpty() && number2.isEmpty()) {
                    return 0;
                } else if (number1.isEmpty()) {
                    return -1;
                } else if (number2.isEmpty()) {
                    return 1;
                }

                return Integer.parseInt(number1) - Integer.parseInt(number2);
            }
        });


        System.out.println("Sorted Cards:");
        for (String card : pack) {
            System.out.println(card);
        }
    }
}