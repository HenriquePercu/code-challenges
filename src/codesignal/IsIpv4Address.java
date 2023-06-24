package codesignal;

public class IsIpv4Address {

    private static final String IPV4_PATTERN =
            "^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}" +
                    "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$";

    public static boolean isIpv4(String str) {
        return str.matches(IPV4_PATTERN);
    }
}
