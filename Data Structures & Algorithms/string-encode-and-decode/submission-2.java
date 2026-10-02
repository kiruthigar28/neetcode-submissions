class Solution {

    public String encode(List<String> strs) {
        if(strs.size() == 0) {
            return "emptyList";
        }
        String str = "";
        for(String s : strs) {
            if(s == null) {
                str += "_null_";
            }
            else if(s.equals("")) {
                str += "_empty_";
            }
            str += s + "!=>!";
        }
        return str;
    }

    public List<String> decode(String str) {

        List<String> strs = new ArrayList<>();
        if(str.equals("emptyList")) {
            return strs;
        }
        String[] strArr = str.split("!=>!");

        for (String s : strArr) {
            if (s.equals("_empty_")) {
                strs.add("");
            }else if(s.equals("_null_")) {
                strs.add(null);
            }
            else {
                strs.add(s);
            }
        }
        return strs;
    }
}
