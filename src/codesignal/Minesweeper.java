package codesignal;

public class Minesweeper {

    int[][] solution(boolean[][] matrix) {
        int[][] response = new int[matrix.length][matrix[0].length];
        int row = 0;
        int column = 0;


        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                int actualPlace = 0;
                if (i - 1 >= 0) {
                    if (matrix[i - 1][j]) {
                        actualPlace++;
                    }
                }
                if (i + 1 < matrix.length) {
                    if (matrix[i + 1][j]) {
                        actualPlace++;
                    }
                }
                if (j - 1 >= 0) {
                    if (matrix[i][j - 1]) {
                        actualPlace++;
                    }
                }
                if (j + 1 < matrix[i].length) {
                    if (matrix[i][j + 1]) {
                        actualPlace++;
                    }
                }
                // check diagonal
                if (j + 1 < matrix[i].length && i + 1 < matrix.length) {
                    if (matrix[i + 1][j + 1]) {
                        actualPlace++;
                    }
                }
                if (j + 1 < matrix[i].length && i - 1 >= 0) {
                    if (matrix[i - 1][j + 1]) {
                        actualPlace++;
                    }
                }
                if (i + 1 < matrix.length && j - 1 >= 0) {
                    if (matrix[i + 1][j - 1]) {
                        actualPlace++;
                    }
                }
                if (i - 1 >= 0 & j - 1 >= 0) {
                    if (matrix[i - 1][j - 1]) {
                        actualPlace++;
                    }
                }

                if (column == response[row].length) {
                    column = 0;
                    row++;
                }

                response[row][column] = actualPlace;
                column++;
            }

        }

        return response;

    }

}
