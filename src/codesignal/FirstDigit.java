package codesignal;

public class FirstDigit {

    char solution(String inputString) {
        for(char character : inputString.toCharArray()){
            if(isNumeric(character)){
                return character;
            }
        }
        return 'a';
    }

    boolean isNumeric(char character){
        try{
            Integer.valueOf(String.valueOf(character));
            return true;
        }catch(Exception e){
            
            return false;
        }
    }

}
