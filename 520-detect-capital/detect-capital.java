class Solution {
    public boolean allcaps(String word){
        if(word.isEmpty()){
            return false;
        }
        return word.equals(word.toUpperCase());
    }
    public boolean first(String word){
        if(word.isEmpty()){
            return false;
        }
        for(int i=1;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public boolean allsmall(String word){
       if(word.isEmpty()){
            return false;
        }
        return word.equals(word.toLowerCase());
    }
    public boolean detectCapitalUse(String word) {
        return allcaps(word)||first(word)||allsmall(word);
    }
}