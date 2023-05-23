package codesignal;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/intro/level-3/9DgaPsE2a7M6M2Hu6">Problem</a>
 */
public class ReverseInParenthesis {

    static String solution(String inputString) {
        Stack<Character> lettersStack = new Stack<>();

        for (char character : inputString.toCharArray()) {
            if(character != ')'){
                lettersStack.add(character);
            }else{
                List<Character> tempCharacterList = new ArrayList<>();
                Character tempCharacter = lettersStack.pop();
                while(tempCharacter != '('){
                    tempCharacterList.add(tempCharacter);
                    tempCharacter = lettersStack.pop();
                }

                lettersStack.addAll(tempCharacterList);
                tempCharacterList.clear();

            }
        }

        return lettersStack.
                stream().
                map(String::valueOf).
                collect(Collectors.joining(""));

    }


}
