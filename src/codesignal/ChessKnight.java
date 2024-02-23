package codesignal;

/**
 * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/intro/level-11/pwRLrkrNpnsbgMndb">Problem</a>
 */
public class ChessKnight {

    int solution(String cell) {
        int possibleMoves = 8;
        if (cell.charAt(0) == 'b' || cell.charAt(0) == 'g') {
            possibleMoves -= 2;
        }
        if (cell.charAt(1) == '2' || cell.charAt(1) == '7') {
            possibleMoves -= 2;
        }
        if (cell.charAt(0) == 'a' || cell.charAt(0) == 'h') {
            possibleMoves /= 2;
        }
        if (cell.charAt(1) == '1' || cell.charAt(1) == '8') {
            possibleMoves /= 2;
        }
        return possibleMoves;
    }


}
