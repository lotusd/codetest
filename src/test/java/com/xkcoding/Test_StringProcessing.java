package com.xkcoding;

import junit.framework.Assert;
import junit.framework.TestCase;

import static com.xkcoding.algorithm.StringProcessing.processString;


/*  uint test for code test 1

    Example:
    Input: aabcccbbad
    Output:
    -> aabbbad
    -> aaad
    -> d
 */


public class Test_StringProcessing extends TestCase {

    public void test01(){

        String input = "aabcccbbad";
        String expected= "d";
        String result = processString(input);

        Assert.assertEquals(expected, result);
    }

    public void test02(){

        String input = "aaa";
        String expected= "";
        String result = result = processString(input);

        Assert.assertEquals(expected, result);
    }

    public void test03(){

        String input = "bbccccc";
        String expected= "bb";
        String result = processString(input);

        Assert.assertEquals(expected, result);
    }

    public void test04(){

        String input = "bbbccaaaaadeeeeeeeeee";
        String expected= "ccd";
        String result =  processString(input);

        Assert.assertEquals(expected, result);
    }

    public void test05(){

        // 2 blanks
        String input = "  ";
        String expected= "  ";
        String result =  processString(input);

        Assert.assertEquals(expected, result);
    }

    public void test06(){

        // 3 blanks
        String input = "   ";
        String expected= "";
        String result =  processString(input);

        Assert.assertEquals(expected, result);
    }

    public void test07(){

        // 3 blanks
        String input = "12345";
        String expected= "12345";
        String result =  processString(input);

        Assert.assertEquals(expected, result);
    }


    public void test08(){

        // 3 blanks
        String input = "12233345555";
        String expected= "1224";
        String result =  processString(input);

        Assert.assertEquals(expected, result);
    }
}
