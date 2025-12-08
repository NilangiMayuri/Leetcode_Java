//Length of last word
//ex:  half moon output is 4 (moon)

class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split("\\s+");
        return words[words.length - 1].length();
    }
}
