package codesignal;


/**
 * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/intro/level-3/3AdBC97QNuhF6RwsQ">Problem</a>
 */
public class IsLucky {

    static boolean solution(int n) {
        String luckyNumber = String.valueOf(n);

        int sizeOfLuckyNumber = luckyNumber.length();

        if (sizeOfLuckyNumber % 2 != 0) {
            return false;
        }

        String firstHalf = luckyNumber.substring(0, (sizeOfLuckyNumber / 2));
        String secondHalf = luckyNumber.substring(sizeOfLuckyNumber / 2, sizeOfLuckyNumber);

        if (sumOfDigits(firstHalf) == sumOfDigits(secondHalf)) {
            return true;
        } else{
            return false;
        }
    }

    private static int sumOfDigits(String number) {
        int sumOfDigits = 0;

        for(char digit : number.toCharArray()){
            sumOfDigits += Integer.valueOf(String.valueOf(digit));
        }

        return sumOfDigits;
    }

}
