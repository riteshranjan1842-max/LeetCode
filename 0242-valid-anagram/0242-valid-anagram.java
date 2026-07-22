class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> sMap = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
             if(sMap.containsKey(ch)){
                int freq = sMap.get(ch);
                sMap.put(ch, freq+1);
             }
             else sMap.put(ch, 1);
        }
        for(int i = 0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(!sMap.containsKey(ch)) return false;
            if(sMap.get(ch)==0) return false;
            sMap.put(ch, sMap.getOrDefault(ch,0)-1);
        }
        return true;
    }
}