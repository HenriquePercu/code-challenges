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

                directionIndex = (directionIndex + 1) % 4;

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


    // another implementation -- changing boundaries on the fly
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int direction = 0; // 0: right, 1: down, 2: left, 3: up
        int num = 1;

        while (top <= bottom && left <= right) {
            if (direction == 0) {
                for (int i = left; i <= right; i++) {
                    matrix[top][i] = num++;
                }
                top++;
            } else if (direction == 1) {
                for (int i = top; i <= bottom; i++) {
                    matrix[i][right] = num++;
                }
                right--;
            } else if (direction == 2) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            } else if (direction == 3) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
            direction = (direction + 1) % 4;
        }

        return matrix;
    }

}
