package codesignal;

public class DepositProfit {

    int solution(int deposit, int rate, int threshold) {

        double years = Math.log((double) threshold / deposit) / Math.log(1 + (rate / 100.0));

        return (int) Math.ceil(years);
    }
}
