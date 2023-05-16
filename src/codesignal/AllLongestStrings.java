package codesignal;

import java.util.ArrayList;
import java.util.List;
public class AllLongestStrings {

    String[] solution(String[] inputArray) {

        int sizeBiggestWord = 0;
        List<String> biggestWords = new ArrayList<>();

        for(String word : inputArray){

            if(word.length() > sizeBiggestWord){
                biggestWords.clear();
                biggestWords.add(word);
                sizeBiggestWord = word.length();
            } else if(word.length() == sizeBiggestWord){
                biggestWords.add(word);
            }

        }
        return biggestWords.toArray(new String[0]);
    }


}
