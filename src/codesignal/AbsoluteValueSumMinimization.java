package codesignal;

/**
 * https://app.codesignal.com/arcade/intro/level-7/ZFnQkq9RmMiyE6qtq/solutions
 */
public class AbsoluteValueSumMinimization {

    int solution(int[] a) {

        int index = a.length % 2 == 0 ? (a.length / 2) - 1 : a.length / 2;

        return a[index];

    }


}
