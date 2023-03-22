package leetcode;

public class ContainerWithWater11 {

    public static void main(String[] args) {

        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));

    }

    public static int maxArea(int[] height) {
        // preciso achar numeros iguais com o mior distancia entre elas
        int maxAmountWater = 0;

        int leftPosition = 0;
        int rightPosition = height.length - 1;

        while (leftPosition != rightPosition) {
            int leftHeight = height[leftPosition];
            int rightHeight = height[rightPosition];

            int waterArea = Math.min(leftHeight, rightHeight) * (rightPosition - leftPosition);

            if (waterArea > maxAmountWater) {
                maxAmountWater = waterArea;
            }

            if (leftHeight < rightHeight) {
                leftPosition++;
            } else {
                rightPosition--;
            }
        }

        return maxAmountWater;
    }

}
