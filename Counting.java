package counting;
import java.util.Scanner;
public class Counting {
    public static void main(String[] args) {
        String topNumber = "";
        String number = "";
        int numberOfRepetitions = 0;
        int topNumberOfRepetitions = 0;
        Scanner reading = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków: ");
        String text = reading.nextLine().toUpperCase().replace(" ", "");
        for (int i = 0; i <= text.length() - 1; i++) {
            if (number.equals(text.substring(i, i + 1))) {
                numberOfRepetitions++;
                if (numberOfRepetitions > topNumberOfRepetitions) {
                    topNumberOfRepetitions = numberOfRepetitions;
                     topNumber = number;
                }
            } else {
                number = text.substring(i, i + 1);
                numberOfRepetitions = 1;
            }
        }
        System.out.println("Najwięcej razy wystąpił znak " + topNumber+", wystąpił " + topNumberOfRepetitions + " razy.");
    }
}
