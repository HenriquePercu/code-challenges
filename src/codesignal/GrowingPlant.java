package codesignal;

public class GrowingPlant {


    /**
     * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/intro/level-9/xHvruDnQCx7mYom3T">Problem</a>
     */
    int solution(int upSpeed, int downSpeed, int desiredHeight) {
        int currentHeight = 0;
        int days = 0;
        while(currentHeight <= desiredHeight) {
            days++;
            currentHeight += upSpeed;

            if(currentHeight >= desiredHeight) {
                return days;
            }

            currentHeight -= downSpeed;
        }
        return days;
    }
}
