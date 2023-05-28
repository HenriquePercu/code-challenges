package codesignal;

/**
 * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/intro/level-4/cC5QuL9fqvZjXJsW9">Problem</a>
 */
public class AlternatingSums {

    int[] solution(int[] a) {

        int[] response = new int[2];

        for(int i = 0 ; i < a.length ; i ++ ){

            if( i % 2 == 0){
                response[0] = response[0] + a[i];
            }else {
                response[1] = response[1] + a[i];
            }

        }
        return response;
    }

}
