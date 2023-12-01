package codesignal;

public class ArrayMaxConsecutiveSum {

    /**
     * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/intro/level-8/Rqvw3daffNE7sT7d5">Problem</a>
     */
    int solution(int[] inputArray, int k) {

        int maxResponse = 0;

        for (int i = 0; i <= inputArray.length - k; i++) {
            int currentResponse = inputArray[i];

            for (int j = i + 1, index = 1; index < k; j++, index++) {
                currentResponse += inputArray[j];
            }

            if (currentResponse > maxResponse) {
                maxResponse = currentResponse;
            }
        }

        return maxResponse;
    }


}
