package leetcode;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        longestCommonPrefix1(new String[]{"flower", "flow", "flight"});
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

    public static String longestCommonPrefix1(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

}
