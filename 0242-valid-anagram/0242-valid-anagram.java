class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
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
             if(tMap.containsKey(ch)){
                int freq = tMap.get(ch);
                tMap.put(ch, freq+1);
             }
             else tMap.put(ch, 1);
        }
        for(char ch : sMap.keySet()){
            int sFreq = sMap.get(ch); 
            int tFreq = tMap.get(ch);
            if(sFreq != tFreq) return false; 
        }
        return true;
    }
}