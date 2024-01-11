package codesignal;

/**
 * Solving this challenge for Code Signal : <a href="https://app.codesignal.com/arcade/intro/level-10/ppZ9zSufpjyzAsSEx">Problem</a>
 */
public class BuildPalindrome {

    String solution(String st) {

        String rs = new StringBuffer(st).reverse().toString();

        for (int i = 0; i < st.length(); i++) {

            if (rs.startsWith(st.substring(i))) {
                //System.out.println(rs + " :: " + st.substring(i));
                return st.substring(0, i) + rs;
            }
        }

        return "?";
    }


}
