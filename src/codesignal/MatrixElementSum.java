package codesignal;

import java.util.ArrayList;
import java.util.List;

/**
 * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/intro/level-2/xskq4ZxLyqQMCLshr">Problem</a>
 */
public class MatrixElementSum {

    int solution(int[][] matrix) {
        int sumOfCosts = 0;

        List<Integer> huntedColumns = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int currentNumber = matrix[i][j];

                if(currentNumber == 0){
                    huntedColumns.add(j);
                }else{
                    if(!huntedColumns.contains(j)){
                        sumOfCosts += currentNumber;
                    }
                }
            }
        }

        return sumOfCosts;
    }

}
