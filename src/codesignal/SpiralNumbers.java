package codesignal;

public class SpiralNumbers {

    public static void main(String[] args){
        solution(4);
    }

    static int[][] solution(int n) {

        int[][] matrix = new int[n][n];

        int index = 1;
        int column = 0;
        int row = 0;
        int directionIndex = 0;

        String[] direction = getDirections(directionIndex).split("\\|");

        while(true) {

            matrix[row][column] = index;
            index++;

            int nextRow = Integer.parseInt(direction[0]);
            int nextColumn = Integer.parseInt(direction[1]);

            if((row + nextRow == n && nextRow != 0)
                    || (row + nextRow < 0 && nextRow != 0)
                    || (column + nextColumn == n && nextColumn != 0)
                    || (column + nextColumn < 0 && nextColumn != 0)
                    || matrix[row + nextRow][column + nextColumn] != 0) {

                if(checkEnd(matrix, row, column, n)){
                    break;
                }

                if(directionIndex == 3){
                    directionIndex = 0;
                }else{
                    directionIndex++;
                }

                direction = getDirections(directionIndex).split("\\|");
                nextRow = Integer.parseInt(direction[0]);
                nextColumn = Integer.parseInt(direction[1]);
            }

            row += nextRow;
            column += nextColumn;
        }

        return matrix;
    }

    static boolean checkEnd(int[][] matrix, int currentRow, int currentColumn, int n){

        return (currentRow + 1  == n || matrix[currentRow + 1][currentColumn] != 0) &&
                (currentRow - 1  < 0 || matrix[currentRow - 1][currentColumn] != 0) &&
                (currentColumn + 1 == n || matrix[currentRow][currentColumn + 1] != 0) &&
                (currentColumn - 1 == n || matrix[currentRow][currentColumn - 1] != 0);

    }

    static String getDirections(int direction){

        switch(direction) {
            case 0:
                return "0|1";
            case 1:
                return "1|0";
            case 2:
                return "0|-1";
            case 3:
                return "-1|0";
            default:
                return "";
        }

    }


}
