package codesignal;

public class BoxBlur {

    int[][] solution(int[][] image) {

        int[][] response = new int[image.length - 2][image[0].length - 2];
        int row = 0;
        int column = 0;

        for (int i = 0; i < image.length; i++) {

            for (int j = 0; j < image[i].length; j++) {

                if (!(i == 0 || j == 0 || i == image.length - 1 || j == image[i].length - 1)) {
                    int calculation = image[i - 1][j - 1] + image[i - 1][j] + image[i - 1][j + 1]
                            + image[i][j] + image[i][j + 1] + image[i + 1][j] +
                            image[i][j - 1] + image[i + 1][j - 1] + image[i + 1][j + 1];
                    System.out.println(calculation / 9);

                    if (column == response[row].length) {
                        column = 0;
                        row++;
                    }

                    response[row][column] = calculation / 9;
                    column++;
                }
            }
        }

        return response;
    }

}
