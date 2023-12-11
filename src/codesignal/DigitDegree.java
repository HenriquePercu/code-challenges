package codesignal;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/intro/level-9/hoLtYWbjdrD2PF6yo">Problem</a>
 */
public class DigitDegree {

    static int solution(int n) {
        String[] digits = String.valueOf(n).split("");
        boolean continueLoop = true;
        int iterationsQtd = 0;

        if(digits.length == 1){
            return 0;
        }

        while(continueLoop) {
            AtomicInteger auxiliarSum = new AtomicInteger();
            Arrays.stream(digits)
                    .forEach( digit -> {
                        int intDigit = Integer.parseInt(digit);
                        auxiliarSum.addAndGet(intDigit);
                    });

            iterationsQtd ++;
            if(String.valueOf(auxiliarSum.get()).split("").length == 1){
                continueLoop = false;
            }else{
                digits = String.valueOf(auxiliarSum).split("");
            }
        }


        return iterationsQtd;
    }

}
