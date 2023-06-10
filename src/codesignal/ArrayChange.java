package codesignal;

public class ArrayChange {

    int solution(int[] inputArray) {

        int response = 0;

        for (int i = 0; i < inputArray.length - 1; i++) {

            if (inputArray[i + 1] <= inputArray[i]) {
                int result = (inputArray[i] - inputArray[i + 1]) + 1;
                System.out.println(result);
                inputArray[i + 1] = inputArray[i + 1] + result;
                response = response + result;
            }
        }
        return response;
    }
}
