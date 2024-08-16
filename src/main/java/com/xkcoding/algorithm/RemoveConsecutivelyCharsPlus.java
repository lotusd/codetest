package com.xkcoding.algorithm;


/*** answer for code test 2
 *
 * @author jian
 * @version 1.0
 */
public class RemoveConsecutivelyCharsPlus {

    static final int REPEATED_CHAR_LEN = 3;

    public static String process(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;

        // System.out.println(str.charAt(i));

        while (i < str.length()) {
            char cur = str.charAt(i);
            int count = 1;
            while (i + 1 < str.length() && str.charAt(i + 1) == cur) {
                count++;
                i++;
            }

            if (count >= REPEATED_CHAR_LEN) {
                // sb.append((char)(cur - 3));
                if (i - count >= 0)
                    sb.append(str.charAt(i - count));
                else
                    sb.append("");
            } else {
                for (int j = 0; j < count; j++) {
                    sb.append(str.charAt(i));
                }
            }

            i++;
        }

        // return sb.toString();

        // condition of recursion end
        if (validationScan(sb.toString()))
            return sb.toString();

        return RemoveConsecutivelyCharsPlus.process(sb.toString());
    }

    // validate string need process or not
    public static boolean validationScan(String str) {

        int i = 0;

        while (i < str.length()) {
            char cur = str.charAt(i);
            int count = 1;
            while (i + 1 < str.length() && str.charAt(i + 1) == cur) {
                count++;
                i++;
            }

            if (count >= REPEATED_CHAR_LEN) {
                return false;
            }

            i++;
        }

        return true;
    }
}
