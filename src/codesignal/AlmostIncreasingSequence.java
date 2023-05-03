package codesignal;

/**
 * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/intro/level-2/2mxbGwLzvkTCKAJMG">Problem</a>
 */
public class AlmostIncreasingSequence {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,1,2}));
    }

    static boolean solution(int[] sequence) {
        int numErr = 0;
        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] - sequence[i + 1] >= 0) {
                // Test whether stepping back or forwards can bridge the hump or pothole
                var noStepBack = i - 1 >= 0 && sequence[i - 1] >= sequence[i + 1];
                var noStepForward = i + 2 < sequence.length && sequence[i] >= sequence[i + 2];

                // We only test for bridge gaps when i > 0
                if (i > 0 && noStepBack && noStepForward) {
                    // Cannot step back over gap forwards or backwards
                    // Counts as two errors ONLY WHEN BOTH PRESENT
                    numErr += 2;
                } else {
                    // Typical error
                    numErr++;
                }
            }

            if (numErr > 1) {
                return false;
            }
        }

        return true;
    }

}
