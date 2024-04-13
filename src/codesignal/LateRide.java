package codesignal;

public class LateRide {

    int solution(int n) {
        String hour = String.format("%02d", n / 60);
        String minute = String.format("%02d", n % 60);

        System.out.println(hour);
        System.out.println(minute);

        return Integer.valueOf(String.valueOf(hour.charAt(0))) +
                Integer.valueOf(String.valueOf(hour.charAt(1))) +
                Integer.valueOf(String.valueOf(minute.charAt(0))) +
                Integer.valueOf(String.valueOf(minute.charAt(1)));
    }


}
