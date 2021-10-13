package questoes;

import java.util.Scanner;
import java.util.Map;
import java.util.Hashtable;

class WordCloud {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split(" ");
        Map<String, Integer> hashtable = new Hashtable<>();

        for (String word : text) {
            if (hashtable.containsKey(word))
                hashtable.put(word, hashtable.get(word) + 1);
            else
                hashtable.put(word, 1);
        }

        while (true) {
            String word = scanner.nextLine();

            if (word.equals("fim"))
                break;

            System.out.println(hashtable.get(word));
        }
    }

}
