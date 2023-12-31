// Given an input string s, reverse the order of the words.
// A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
// Return a string of the words in reverse order concatenated by a single space.
// Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        reverseArray(words);
        return String.join(" ", words);
    }
    public static void reverseArray(String[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }
    }
}
