class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String str="";
        for(String t : words ){
            str+=t;
            if(str.equals(s)) return true;
        }
        return false;
    }
}