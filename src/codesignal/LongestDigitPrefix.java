package codesignal;

public class LongestDigitPrefix {


    /**
     * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/intro/level-9/AACpNbZANCkhHWNs3">Problem</a>
     */
    String solution(String inputString) {

        String currentPrefix = "";

        for(char character: inputString.toCharArray()) {

            if(Character.isDigit(character)){
                currentPrefix += character;
            }else{
                break;
            }

        }
        return currentPrefix;
    }

}
