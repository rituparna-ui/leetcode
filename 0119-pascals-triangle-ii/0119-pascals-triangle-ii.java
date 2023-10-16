class Solution {
    public List<Integer> getRow(int n) {
        List<Integer> ans = new ArrayList<>();
        
        long icj = 1;

        for(int i=0; i<=n; i++){
            ans.add((int)(icj));
            icj *= n-i;
            icj /= i+1;
        }

        return ans;
    }
}