package codesignal;

/**
 * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/intro/level-12/YqZwMJguZBY7Hz84T">Problem</a>
 */
public class SumUpNumbers {

    int solution(String inputString) {

        int sum = 0;
        String currentNum = "";


        for(char character: inputString.toCharArray()){
            if(isNumeric(String.valueOf(character))){
                currentNum += character;
            } else{

                if(currentNum != ""){
                    sum += Integer.valueOf(currentNum);
                    currentNum = "";
                }

            }
        }

        if(currentNum != ""){
            sum += Integer.valueOf(currentNum);
            currentNum = "";
        }

        return sum;
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}
