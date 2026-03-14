class Solution {
    public boolean isAnagram(String s, String t) {
        char b[] =s.toCharArray();
        char[] c=t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(b);
        if(Arrays.equals(c,b))
        {
            return true;
        }
        else{
            return false;
        }
    }
}