/**
 *
 * Copyright (C) 2017 Deveryware S.A. All Rights Reserved.
 *
 */
package com.qph.palindrome;

/**
 * Created by Quoc PHAN on 06/11/2017.
 */
public class Palindrome {
    private Palindrome()
    {
    }

    public static boolean isPalindrome(String word) {
        final int length = word.length();
        for (int i = 0; i < length/2; i++) {
            if (!String.valueOf(word.charAt(i)).equalsIgnoreCase(String.valueOf(word.charAt(length - i - 1)))){
                return false;
            }
        }
        return true;
    }
}
