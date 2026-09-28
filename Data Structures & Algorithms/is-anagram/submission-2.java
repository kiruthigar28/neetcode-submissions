class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] cArr = new int[26];
        for (char c : s.toCharArray()) {
            int temp = c - 'a';
            cArr[temp]++;
        }
        for (char c : t.toCharArray()) {
            int temp = c - 'a';
            if (cArr[temp] == 0) {
                return false;
            }
            cArr[temp]--;
        }

        int sum = 0;
        for (int i : cArr) {
            sum += i;
        }

        return sum == 0;
    }
}
