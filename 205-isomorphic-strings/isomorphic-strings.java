class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> charMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char o = s.charAt(i);
            char r = t.charAt(i);

            if (!charMap.containsKey(o)) {
                if (charMap.containsValue(r)) {
                    return false; // r is already mapped to another key
                }
                charMap.put(o, r);
            } else {
                char mapChar = charMap.get(o);
                if (mapChar != r) {
                    return false;
                }
            }
        }
        return true;
    }
}