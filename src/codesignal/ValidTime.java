package codesignal;

/**
 * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/intro/level-12/ywMyCTspqGXPWRZx5">Problem</a>
 */
public class ValidTime {

    boolean solution(String time) {

        String[] hourParts = time.split(":");

        int hour = Integer.parseInt(hourParts[0]);
        int minute = Integer.parseInt(hourParts[1]);

        return hour >= 0 && hour < 24 && minute >= 0 && minute < 60;
    }



}
