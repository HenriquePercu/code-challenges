package codesignal;



/**
 * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/intro/level-12/sCpwzJCyBy2tDSxKW">Problem</a>
 */
public class MessageFromBinaryCode {

    String solution(String code) {

        char[] characters = code.toCharArray();
        StringBuilder binaryLetter = new StringBuilder();
        StringBuilder wholeWorld = new StringBuilder();

        for(int i = 0; i < characters.length; i++){
            binaryLetter.append(characters[i]);

            if(binaryLetter.length() == 8) {
                int decimalNumber = Integer.parseUnsignedInt(binaryLetter.toString(), 2);

                char character = (char) decimalNumber;

                wholeWorld.append(character);

                binaryLetter.setLength(0);
            }

        }
        return wholeWorld.toString();
    }


}
