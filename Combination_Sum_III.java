class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans= new  ArrayList<>();
        List<Integer> list= new  ArrayList<>();
        solution(n,k,1,0,ans,list,0);
        return ans; 
    }
    public static void solution(int n, int k, int idx,int sum, List<List<Integer>> ans, List<Integer> list,int prev ){    
         if (sum == n && k == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if (sum > n) {
            return;
        }
        for (int i = prev+1; i <= 9; i++) {
            if (i > n) {
                break;
            }
            list.add(i);
            solution(n, k - 1, i + 1, sum + i, ans, list, i);
            list.remove(list.size() - 1);
        }
    }
}
