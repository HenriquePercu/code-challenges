package codesignal;

/**
 * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/intro/level-12/s9qvXv4yTaWg8g4ma">Problem</a>
 */
public class LongestWord {

    String solution(String text) {

        String longestWord = "";
        StringBuilder currentWord = new StringBuilder();

        for (char character : text.toCharArray()) {

            if (Character.isAlphabetic(character)) {
                currentWord.append(character);
            } else {
                if(currentWord.length() > longestWord.length()){
                    longestWord = currentWord.toString();
                }
                currentWord = new StringBuilder();
            }

        }

        if(currentWord.length() > longestWord.length()){
            longestWord = currentWord.toString();
        }

        return longestWord;

    }

}
