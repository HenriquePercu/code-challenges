package codesignal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/intro/level-10/HJ2thsvjL25iCvvdm">Problem</a>
 */
public class IsMacAddress {

    boolean solution(String inputString) {
        String[] hexidecimal = inputString.split("-");

        if(hexidecimal.length != 6 || inputString.charAt(inputString.length() - 1) == '-' || inputString.charAt(0) == '-'){
            return false;
        }

        for(String partHex : hexidecimal){
            if(isBlankString(partHex) || !isHexadecimal(partHex) || partHex.length() != 2){
                return false;
            }
        }

        return true;
    }


    private boolean isHexadecimal(String input) {
        final Matcher matcher = Pattern.compile("\\p{XDigit}+").matcher(input);
        return matcher.matches();
    }

    boolean isBlankString(String string) {
        return string == null || string.trim().isEmpty();
    }

}
