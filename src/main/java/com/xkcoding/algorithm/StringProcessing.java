package com.xkcoding.algorithm;


/*** answer for code test 1
 *
 * @author jian
 * @version 1.0
 */
public class StringProcessing {

    static final int REPEATED_CHAR_LEN = 3;

    public static String processString(String str) {
        while (true) {
            boolean changed = false;
            StringBuilder newStr = new StringBuilder();
            int i = 0;
            while (i < str.length()) {
                int count = 1;
                while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                    count++;
                    i++;
                }
                if (count < REPEATED_CHAR_LEN) {
                    for (int j = 0; j < count; j++) {
                        newStr.append(str.charAt(i));
                    }
                }
                i++;
            }
            String result = newStr.toString();
            if (result.equals(str)) {
                break;
            }
            str = result;
        }
        return str;
    }
}
