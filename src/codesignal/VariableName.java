package codesignal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VariableName {

    boolean solution(String name) {
        Pattern p = Pattern.compile("^[a-zA-Z0-9_]*$");
        Pattern onlyWord = Pattern.compile("^[a-zA-Z_]*$");
        Matcher m = p.matcher(name);
        Matcher m1 = onlyWord.matcher(String.valueOf(name.charAt(0)));
        return m1.matches() && m.matches();
    }


}
