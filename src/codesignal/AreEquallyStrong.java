package codesignal;


/**
 * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/intro/level-5/g6dc9KJyxmFjB98dL">Problem</a>
 */
public class AreEquallyStrong {

    boolean solution(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {

        if( (yourLeft == friendsLeft && yourRight == friendsRight )
                || yourLeft == friendsRight && yourRight == friendsLeft) {
            return true;
        } else {
            return false;
        }
    }


}
