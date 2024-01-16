package codesignal;

import java.util.Arrays;

/**
 * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/intro/level-10/8RiRRM3yvbuAd3MNg">Problem</a>
 */
public class ElectionWinners {

    int solution(int[] votes, int k) {
        int response = 0;
        Arrays.sort(votes);

        int max = votes[votes.length-1];

        System.out.println(max);

        for(int i = 0; i < votes.length; i++ ){

            if (votes[i] + k > max){
                response++;
            }
        }

        if(response == 0){
            if(votes[votes.length-1] != votes[votes.length-2]){
                response ++ ;
            }
        }
        return response;
    }


}
