package codesignal;

public class CircleOfNumbers {

    int solution(int n, int firstNumber) {

        int half = n / 2;
        int radiallyOpposed = firstNumber > half ? firstNumber - half : firstNumber + half;

        return radiallyOpposed != n ? radiallyOpposed : 0;

    }


}
