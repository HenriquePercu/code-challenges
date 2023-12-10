package codesignal;

public class LongestDigitPrefix {


    /**
     * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/intro/level-9/AACpNbZANCkhHWNs3">Problem</a>
     */
    String solution(String inputString) {

        String currentPrefix = "";
        String maxPrefix = "";

        for(char character: inputString.toCharArray()) {

            if(Character.isDigit(character)){
                currentPrefix += character;
            }else{

                if(currentPrefix.length() > maxPrefix.length()){
                    maxPrefix = currentPrefix;
                }

                currentPrefix = "";
                break;
            }

        }

        if(currentPrefix.length() > maxPrefix.length()){
            maxPrefix = currentPrefix;
        }

        return maxPrefix;
    }

}
