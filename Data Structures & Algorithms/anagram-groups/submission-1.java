class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        boolean[] visit = new boolean[strs.length];
        List<String> subset = new ArrayList<>();
        List<List<String>> output = new ArrayList<>();
        HashMap<String, List<String>> hashVal = new HashMap<>();

        for(String s : strs) {
            String key = findHash(s);
            if (hashVal.containsKey(key)) {
                subset = hashVal.get(key);
                subset.add(s);
                hashVal.put(key,subset);
                // add to arr and add
            }else {
                subset.add(s);
                hashVal.put(key,subset);
            }
            subset = new ArrayList<>();
        }
        for(List<String> str : hashVal.values()) {
            output.add(str);
        }
        return output;
    }

    static String findHash(String s) {
        int[] order = new int[26];
        for (char c : s.toCharArray()) {
            order[c-'a']++;
        }
        String hashValue = "";
        for(int i=0 ; i<order.length ; i++) {
            char temp = (char) (i+'a');
            hashValue += temp + order[i];
        }
        return hashValue;
    }
}
