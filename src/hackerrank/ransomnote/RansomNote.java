package hackerrank.ransomnote;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RansomNote {

    public static void checkMagazine(List<String> magazine, List<String> note) {
        HashMap<String, Integer> magazineWordsFrequency = new HashMap<>();
        HashMap<String, Integer> noteWordsFrequency = new HashMap<>();

        for (int i = 0; i < Math.max(magazine.size(), note.size()); i++) {

            if (i < magazine.size()) {
                String word = magazine.get(i);
                int updatedFrequency = magazineWordsFrequency.getOrDefault(word, 0) + 1;
                magazineWordsFrequency.put(word, updatedFrequency);
            }

            if (i < note.size()) {
                String word = note.get(i);
                int updatedFrequency = noteWordsFrequency.getOrDefault(word, 0) + 1;
                noteWordsFrequency.put(word, updatedFrequency);
            }

        }

        for (Map.Entry<String, Integer> entry : noteWordsFrequency.entrySet()) {

            Integer magazineFrequency = magazineWordsFrequency.getOrDefault(entry.getKey(), 0);
            
            if(entry.getValue() > (magazineFrequency)){
                System.out.println("No");
                return;
            }

        }

        System.out.println("Yes");

    }


}
