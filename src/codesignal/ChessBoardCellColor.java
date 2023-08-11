package codesignal;

public class ChessBoardCellColor {

    boolean solution(String cell1, String cell2) {

        int x1 = cell1.charAt(0);
        int x2 = cell1.charAt(1);

        boolean isBlackCell1 = (x1 % 2 != 0 && x2 % 2 != 0) || (x1 % 2 == 0 && x2 % 2 == 0);

        int y1 = cell2.charAt(0);
        int y2 = cell2.charAt(1);

        boolean isBlackCell2 = (y1 % 2 != 0 && y2 % 2 != 0) || (y1 % 2 == 0 && y2 % 2 == 0);

        return isBlackCell1 == isBlackCell2;

    }


}
