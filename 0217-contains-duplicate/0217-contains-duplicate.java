class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int numz:nums)
        {
            if(set.contains(numz))
            {
                return true;
            }
            set.add(numz);
        }
        return false;
    }
}