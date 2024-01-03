package codesignal;


/**
 * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/intro/level-9/6M57rMTFB9MeDeSWo">Problem</a>
 */
public class BishopAndPawn {

    boolean solution(String bishop, String pawn) {
        char[] bishopArray = bishop.toCharArray();
        char[] pawnArray = pawn.toCharArray();

        int columnDifference = (int) bishopArray[0] -  (int) pawnArray[0];
        int lineDifference = (int) bishopArray[1] -  (int) pawnArray[1];

        return Math.abs(columnDifference) == Math.abs(lineDifference);
    }


}
