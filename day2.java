import java.math.BigInteger;

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        BigInteger gcdLength = BigInteger.valueOf(len1).gcd(BigInteger.valueOf(len2));
        int gcd = gcdLength.intValue();


        String potentialDivisor = str1.substring(0, gcd);

        if (isValidDivisor(str1, potentialDivisor) && isValidDivisor(str2, potentialDivisor)) {
            return potentialDivisor;
        } else {
            return "";
        }
    }

    private static boolean isValidDivisor(String str, String divisor) {
        StringBuilder result = new StringBuilder();
        int repetitions = str.length() / divisor.length();
        
        for (int i = 0; i < repetitions; i++) {
            result.append(divisor);
        }

        return str.equals(result.toString());
    }
    
}
