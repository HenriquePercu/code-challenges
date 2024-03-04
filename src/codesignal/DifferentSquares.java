package codesignal;

import java.util.HashMap;

public class DifferentSquares {

    int solution(int[][] matrix) {

        HashMap<String, Integer> maps = new HashMap<>();
        int uniqueMaps = 0;

        for (int i = 0; i < matrix.length - 1; i++) {

            for (int j = 0; j < matrix[i].length - 1; j++) {

                String square = matrix[i][j] + "" + matrix[i + 1][j] + matrix[i][j + 1] + matrix[i + 1][j + 1];

                Integer existingSquare = maps.get(square);

                if (existingSquare == null) {
                    maps.put(square, 1);
                    uniqueMaps++;
                }

            }

        }

        return uniqueMaps;
    }


}
