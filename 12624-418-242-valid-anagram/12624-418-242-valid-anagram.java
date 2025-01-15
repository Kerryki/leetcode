class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer>map=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                int value= map.get(s.charAt(i))+1;
                map.replace(s.charAt(i),value);
            }else{
                map.put(s.charAt(i), 1);
            }
        }

        for(int i=0; i<t.length(); i++){
            if(!map.containsKey(t.charAt(i))){
                return false;
            }else{
                int value= map.get(t.charAt(i))-1;
                map.replace(t.charAt(i),value);
                if(value==0){
                    map.remove(t.charAt(i));
                }
            }
        }
        return true;

    }
}