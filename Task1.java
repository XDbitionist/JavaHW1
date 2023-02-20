package org.example.hw1;

//Given an input string s, reverse the order of the words.
//
//        A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
//
//        Return a string of the words in reverse order concatenated by a single space.
//
//        Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words.
//        Do not include any extra spaces.

public class Task1 {
    public static String reverseWords(String s) {
        // Trim leading and trailing spaces
        s = s.trim();

        // Split the string by one or more spaces
        String[] words = s.split("\\s+");

        // Reverse the array of words
        for (int i = 0, j = words.length - 1; i < j; i++, j--) {
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
        }

        // Join the words with a single space
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        String s = "  the sky is blue  ";
        System.out.println(reverseWords(s)); // Output: "blue is sky the"
    }
}
