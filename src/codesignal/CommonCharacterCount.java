package codesignal;


/**
 * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/intro/level-3/JKKuHJknZNj4YGL32">Problem</a>
 */
public class CommonCharacterCount {

    static int solution(String s1, String s2) {
        String wordToCompare = s2;
        int response = 0;

        for (char character : s1.toCharArray()) {
            String characterConverted = String.valueOf(character);

            if (wordToCompare.contains(characterConverted)) {
                wordToCompare = wordToCompare.replaceFirst(characterConverted, "");
                response++;
            }
        }

        return response;
    }

}
