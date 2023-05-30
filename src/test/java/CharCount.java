public class CharCount {
    public static void main (String [] args) {
        String word = "Malayalam";
        char CharA = 'a';
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == CharA) {
                count++;
            }
        }
        System.out.println(" occurance of " + CharA + " in the string is " + count + " times   ");


    }
}