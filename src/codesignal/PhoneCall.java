package codesignal;

/**
 * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/code-arcade/intro-gates/mZAucMXhNMmT7JWta">Problem</a>
 */
public class PhoneCall {

    int solution(int min1, int min2_10, int min11, int s) {
        int minutesCall = 0;

        if(min1 > s){
            return minutesCall;
        }

        minutesCall = 1;
        s = s - min1;

        if(min2_10 > s){
            return minutesCall;
        }

        for(int i =0; i < 9; i++){
            minutesCall++;
            s = s - min2_10;

            if(min2_10 > s){
                return minutesCall;
            }
        }

        if(min11 > s){
            return minutesCall;
        }

        minutesCall = minutesCall + (s / min11);

        return minutesCall;
    }


}
