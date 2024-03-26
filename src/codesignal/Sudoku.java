package codesignal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Sudoku {

    boolean solution(int[][] grid) {

        HashMap<Integer, Integer> numberFrequencyRow = new HashMap<>();

        // check row
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                Integer frequency = numberFrequencyRow.getOrDefault(grid[i][j], 0);

                if (frequency != 0) {
                    return false;
                } else {
                    numberFrequencyRow.put(grid[i][j], 1);
                }
            }
            numberFrequencyRow.clear();
        }

        // check column
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                Integer frequency = numberFrequencyRow.getOrDefault(grid[j][i], 0);

                if (frequency != 0) {
                    return false;
                } else {
                    numberFrequencyRow.put(grid[j][i], 1);
                }
            }
            numberFrequencyRow.clear();
        }

        if (checkSquare(1, 1, grid)) return false;
        if (checkSquare(1, 3, grid)) return false;
        if (checkSquare(1, 5, grid)) return false;

        if (checkSquare(4, 1, grid)) return false;
        if (checkSquare(4, 3, grid)) return false;
        if (checkSquare(4, 5, grid)) return false;

        if (checkSquare(7, 1, grid)) return false;
        if (checkSquare(7, 3, grid)) return false;
        if (checkSquare(7, 5, grid)) return false;

        return true;

    }

    private boolean checkSquare(int row, int column, int[][] grid) {
        List<Integer> numbers = new ArrayList<>();

        if (checkAndAdd(grid[row][column], numbers)) return true;
        if (checkAndAdd(grid[row - 1][column], numbers)) return true;
        if (checkAndAdd(grid[row][column - 1], numbers)) return true;
        if (checkAndAdd(grid[row - 1][column - 1], numbers)) return true;
        if (checkAndAdd(grid[row + 1][column], numbers)) return true;
        if (checkAndAdd(grid[row][column + 1], numbers)) return true;
        if (checkAndAdd(grid[row + 1][column + 1], numbers)) return true;
        if (checkAndAdd(grid[row + 1][column - 1], numbers)) return true;
        if (checkAndAdd(grid[row - 1][column + 1], numbers)) return true;

        return false;
    }

    private boolean checkAndAdd(int number, List<Integer> numbers) {
        if (numbers.contains(number)) {
            return true;
        } else {
            numbers.add(number);
            return false;
        }
    }

}
