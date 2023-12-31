// Given an array of characters chars, compress it using the following algorithm:
// Begin with an empty string s. For each group of consecutive repeating characters in chars:
// If the group's length is 1, append the character to s.
// Otherwise, append the character followed by the group's length.
// The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.
// After you are done modifying the input array, return the new length of the array.
// You must write an algorithm that uses only constant extra space.

class Solution {
    public int compress(char[] chars) {
        if (chars == null || chars.length == 0) {
            return 0;
        }

        int writeIndex = 0; 
        int anchor = 0;

        for (int readIndex = 1; readIndex <= chars.length; readIndex++) {
            if (readIndex == chars.length || chars[readIndex] != chars[anchor]) {
                chars[writeIndex++] = chars[anchor];
                int count = readIndex - anchor;
                if (count > 1) {
                    for (char c : Integer.toString(count).toCharArray()) {
                        chars[writeIndex++] = c;
                    }
                }
                anchor = readIndex;
            }
        }

        return writeIndex;
    }
}
