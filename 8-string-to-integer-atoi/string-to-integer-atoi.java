class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        // Remove leading whitespaces
        s = s.trim();

        if (s.length() == 0) {
            return 0;
        }

        int i = 0;
        int sign = 1;

        // Check for sign
        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }

        long res = 0;

        // Process digits
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            res = res * 10 + (s.charAt(i) - '0');
            
            // Check for overflow
            if (res * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (res * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int) (res * sign);
    }
}
