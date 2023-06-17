package codesignal;


/**
 * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/intro/level-5/EEJxjQ7oo7C5wAGjE">Problem</a>
 */
public class ArrayMaximalAdjacentDifference {

    int solution(int[] inputArray) {

        int biggestDifference = 0;

        for (int i = 0; i < inputArray.length - 1; i++) {
            int difference = Math.abs(inputArray[i] - inputArray[i + 1]);

            if (difference > biggestDifference) {
                biggestDifference = difference;
            }
        }
        return biggestDifference;
    }


}
