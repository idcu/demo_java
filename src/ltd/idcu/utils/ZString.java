package ltd.idcu.utils;

public class ZString {
    public static String reverse(String s) {
        String s1 = "";
        int l = s.length();
        for (int i = 0; i < l; i++) {
            s1 += s.charAt(l - 1 - i);
        }
        return s1;
    }

    public static boolean checkPalindroom(String s) {
        int l = s.length();
        for (int i = 0; i < l; i++) {
            if (s.charAt(i) != s.charAt(l - 1 -i)) {
                return false;
            }
        }
        return true;
    }

    public static String upperCaseFirst(String s) {
        if (Character.isUpperCase(s.charAt(0))) {
            return s;
        } else {
            return "" + Character.toUpperCase(s.charAt(0)) + s.substring(1);
        }
    }

    public static String lowerCaseFirst(String s) {
        if (Character.isLowerCase(s.charAt(0))) {
            return s;
        } else {
            return "" + Character.toLowerCase(s.charAt(0)) + s.substring(1);
        }
    }

    public static String upperCaseWordFirst(String s) {
        String s1 = "";
        for (String w: s.split(" ")) {
            s1 += " " + upperCaseFirst(w);
        }
        return s1.substring(1);
    }
}
