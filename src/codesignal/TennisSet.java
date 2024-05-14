package codesignal;

/**
 * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/code-arcade/at-the-crossroads/">Problem</a>
 */
public class TennisSet {
    boolean solution(int score1, int score2) {
        int w = Math.max(score1, score2), l = Math.min(score1, score2);
        return w == 6 && l < 5 || w == 7 && (l == 5 || l == 6);
    }

}
