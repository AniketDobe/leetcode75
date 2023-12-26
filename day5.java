//Given a string s, reverse only all the vowels in the string and return it.
// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once

class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            while (start < end && !isVowel(chars[start])) {
                start++;
            }
            while (start < end && !isVowel(chars[end])) {
                end--;
            }
            if (start < end) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
        }
        return new String(chars);
    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
