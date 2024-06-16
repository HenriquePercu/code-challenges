package leetcode;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        longestCommonPrefix(new String[]{"flower", "flow", "flight"});
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder response = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            try {
                char currentWord = strs[0].charAt(i);

                for (int j = 1; j < strs.length; j++) {
                    if (currentWord != strs[j].charAt(i)) {
                        return response.toString();
                    }
                }
                response.append(currentWord);
            } catch (StringIndexOutOfBoundsException ex) {
                return response.toString();
            }
        }
        return response.toString();
    }

}
