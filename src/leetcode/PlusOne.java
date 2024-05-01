package leetcode;

public class PlusOne {

    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] == 9) {
                digits[i] = 0;

                if (i == 0) {
                    int[] auxNums = new int[digits.length + 1];
                    auxNums[0] = 1;
                    System.arraycopy(digits, 0, auxNums, 1, digits.length - 1);
                    digits = auxNums;
                }

            } else {
                digits[i] = digits[i] + 1;
                break;
            }

        }
        return digits;
    }

}
