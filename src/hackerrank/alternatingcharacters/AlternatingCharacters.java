package hackerrank.alternatingcharacters;

public class AlternatingCharacters {

    public static void main(String[] args) {
        System.out.println(alternatingCharacters("AAABBB"));
    }


    public static int alternatingCharacters(String s) {
        int removedChars = 0;
        char previouslyChar = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {

            char currentChar = s.charAt(i);
            if (currentChar == previouslyChar) {
                removedChars++;
            } else {
                previouslyChar = currentChar;
            }
        }

        return removedChars;
    }

}
