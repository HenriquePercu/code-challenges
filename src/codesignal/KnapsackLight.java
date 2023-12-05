package codesignal;


/**
 * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/intro/level-9/r9azLYp2BDZPyzaG2">Problem</a>
 */
public class KnapsackLight {

    int solution(int value1, int weight1, int value2, int weight2, int maxW) {

        int response = 0;

        if(weight1 + weight2 <= maxW ){
            return value1 + value2;
        }

        if(weight1 <= maxW && weight2 <= maxW){
            return Math.max(value1, value2);
        }

        if(weight1 <= maxW){
            return value1;
        }

        if(weight2 <= maxW){
            return value2;
        }

        return response;

    }


}
