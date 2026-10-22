class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;

        if (s.length() == 1) {
            return true;
        }
        while (start <= end) {
            if (!Character.isLetterOrDigit(s.charAt(start))) {
                start += 1;
            }
            if (!Character.isLetterOrDigit(s.charAt(end))) {
                end -= 1;
            }

            if (!Character.isLetterOrDigit(s.charAt(start))
                || !Character.isLetterOrDigit(s.charAt(end))) {
                continue;
            }

            if (!(s.charAt(start) == s.charAt(end))) {
                return false;
            }

            start++;
            end--;
        }
        return true;
    }
}
