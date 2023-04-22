package codesignal;

public class AdjacementElementsProduct {

    int solution(int[] inputArray) {
        // percorrer array calculando o produto dos adjacentes
        int maximumProduct = Integer.MIN_VALUE;

        for(int i = 0; i < inputArray.length -1; i++){

            int product = inputArray[i] * inputArray[i+1];

            if(product > maximumProduct){
                maximumProduct = product;
            }

        }

        return maximumProduct;

    }


}
