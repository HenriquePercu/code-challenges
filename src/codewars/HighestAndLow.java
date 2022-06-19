package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HighestAndLow {

    public static String highAndLow(String numbers) {
        List<Integer> numeros = Arrays.stream(numbers.split(" ")).map(Integer::valueOf).collect(Collectors.toList());

        // Code here or
        return "" + Collections.max(numeros) + " " + Collections.min(numeros);
    }

}
