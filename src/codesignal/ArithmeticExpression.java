package codesignal;

/**
 * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/code-arcade/at-the-crossroads/QrCSNQWhnQoaK9KgK">Problem</a>
 */
public class ArithmeticExpression {

    boolean solution(int a, int b, int c) {
        if(a + b == c){
            return true;
        }
        if(a * b == c){
            return true;
        }
        if(a - b == c){
            return true;
        }
        if(a / b == c && a % b == 0){
            return true;
        }
        return false;
    }


}
