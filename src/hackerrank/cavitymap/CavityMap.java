package hackerrank.cavitymap;

import java.util.Arrays;
import java.util.List;

public class CavityMap {

    public static void main(String[] args) {
        cavityMap(Arrays.asList("1112", "1912", "1892", "1234"));
    }

    public static List<String> cavityMap(List<String> grid) {
        // Write your code here
        String[][] arrayCavityMap = createMap(grid);
        System.out.println(Arrays.deepToString(arrayCavityMap));
        // percorrer a matriz
        for (int row = 0; row < arrayCavityMap[0].length; row++) {

            if (row == 0 || row == arrayCavityMap[0].length - 1) continue;

            for (int column = 0; column < arrayCavityMap[row].length; column++) {

                if (column == 0 || column == arrayCavityMap[row].length - 1) continue;
                System.out.println(arrayCavityMap[row][column]);
                if (isCavity(arrayCavityMap[row][column], row, column, arrayCavityMap)) {
                    System.out.println(row + ":" + column + " e uma cavidade");
                    replaceOnGrid(row, column, grid);
                }
            }
        }
        return grid;
    }

    private static boolean isCavity(String value, int row, int column, String[][] arrayCavityMap) {
        // check borders
        if (Integer.parseInt(arrayCavityMap[row - 1][column]) < Integer.parseInt(value) &&
                Integer.parseInt(arrayCavityMap[row][column - 1]) < Integer.parseInt(value) &&
                Integer.parseInt(arrayCavityMap[row + 1][column]) < Integer.parseInt(value) &&
                Integer.parseInt(arrayCavityMap[row][column + 1]) < Integer.parseInt(value)) {
            return true;
        } else {
            return false;
        }
    }

    private static void replaceOnGrid(int row, int column, List<String> grid) {
        char[] myNameChars = grid.get(row).toCharArray();
        myNameChars[column] = 'X';
        grid.set(row,String.valueOf(myNameChars));
    }

    private static String[][] createMap(List<String> grid) {
        String[][] arrayCavityMap = new String[grid.get(0).length()][grid.get(0).length()];

        for (int row = 0; row < grid.size(); row++) {
            for (int column = 0; column < grid.get(row).split("").length; column++) {
                arrayCavityMap[row][column] = grid.get(row).split("")[column];
            }
        }

        return arrayCavityMap;
    }


}
