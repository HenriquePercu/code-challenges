package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> fizzBuzzzes = new ArrayList<String>();

        for(int i = 1; i <= n; i++){
            fizzBuzzzes.add(getFizzBuzz(i));
        }

        return fizzBuzzzes;
    }

    private String getFizzBuzz(int n){
        if(n % 15 == 0){
            return "FizzBuzz";
        }else if(n%3 == 0){
            return "Fizz";
        }else if(n%5 == 0){
            return "Buzz";
        } else{
            return String.valueOf(n);
        }
    }

}
