package com.xkcoding;

import com.xkcoding.algorithm.RemoveConsecutivelyCharsPlus;
import junit.framework.Assert;
import junit.framework.TestCase;


/*  uint test for code test 1

    Example:
    ccc -> b
    bbb -> a
    Input: abcccbad
    Output:
    -> abbbad, ccc is replaced by b
    -> aaad, bbb is replaced by a
    -> d
 */

public class Test_RemoveConsecutivelyCharsPlus extends TestCase {

    public void test01() {

        String input = "abcccbad";
        String expected = "d";
        String result = RemoveConsecutivelyCharsPlus.process(input);

        Assert.assertEquals(expected, result);
    }


    public void test02() {

        String input = "aaabbb";
        String expected = "a";
        String result = RemoveConsecutivelyCharsPlus.process(input);

        Assert.assertEquals(expected, result);
    }

    public void test03() {

        String input = "aabbb";
        String expected = "";
        String result = RemoveConsecutivelyCharsPlus.process(input);

        Assert.assertEquals(expected, result);
    }

    public void test04() {

        String input = "bbbb";
        String expected = "";
        String result = RemoveConsecutivelyCharsPlus.process(input);

        Assert.assertEquals(expected, result);
    }

    public void test05() {

        String input = "abc";
        String expected = "abc";
        String result = RemoveConsecutivelyCharsPlus.process(input);

        Assert.assertEquals(expected, result);
    }

    public void test6() {

        String input = "aabbccddeefff";
        String expected = "";
        String result = RemoveConsecutivelyCharsPlus.process(input);

        Assert.assertEquals(expected, result);

    }

    public void test7() {

        String input = "aabbccddeeffff";
        String expected = "";
        String result = RemoveConsecutivelyCharsPlus.process(input);

        Assert.assertEquals(expected, result);
    }

    public void test8() {

        String input = "aaaabbccddeeffff";
        String expected = "";
        String result = RemoveConsecutivelyCharsPlus.process(input);

        Assert.assertEquals(expected, result);
    }

    public void test9() {

        String input = "aaaabbcccccddeeffff";
        String expected = "";
        String result = RemoveConsecutivelyCharsPlus.process(input);

        Assert.assertEquals(expected, result);
    }
}
