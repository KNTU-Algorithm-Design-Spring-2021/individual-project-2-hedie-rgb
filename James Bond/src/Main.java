import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String words = str.toLowerCase();
        for (int i = 0 ; i < words.length() ; i ++) {
            for (int j = i + 1 ; j <= words.length() ; j ++) {
                String word = words.substring(i, j);
                if (SearchForMeaning.isValid(word)) {
                    System.out.println(word);
                }
            }
        }
    }
}
