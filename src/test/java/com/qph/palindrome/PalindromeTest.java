package com.qph.palindrome;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Quoc PHAN on 06/11/2017.
 */
public class PalindromeTest {
    @Test
    public void testIsPalindrome() throws Exception
    {
        Assert.assertTrue(Palindrome.isPalindrome("Deleveled"));
        Assert.assertTrue(Palindrome.isPalindrome("Anna"));
        Assert.assertTrue(Palindrome.isPalindrome("Sagas"));
        Assert.assertTrue(Palindrome.isPalindrome("sagas"));
        Assert.assertFalse(Palindrome.isPalindrome("javacore"));
    }
}