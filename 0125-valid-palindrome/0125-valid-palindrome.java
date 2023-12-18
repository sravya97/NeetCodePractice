class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        while(start < end){
            char startChar = s.charAt(start);
            char endChar = s.charAt(end);
            if(!Character.isLetterOrDigit(startChar)){
                start++;
                continue;
            } else if(!Character.isLetterOrDigit(endChar)){
                end--;
                continue;
            } else {
                if(Character.toLowerCase(startChar) == Character.toLowerCase(endChar)) {
                    start++;
                    end--;
                    continue;
                } else{
                    return false;
                }
            }
        }
        return true;
        
    }
}