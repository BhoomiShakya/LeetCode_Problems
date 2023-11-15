class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        return solution(spells, potions, success);  
    }
    public static int[] solution(int[] s, int[] p, long t) {
        int []ans=new int[s.length];
        Arrays.sort(p);
        
        for(int i=0;i<s.length;i++){
            int j=s[i];
            int l=0;
            int r=p.length-1;
            while(l<=r){
                int mid= l+ (r-l)/2;
                long pro=(long)j*p[mid]; 
                if(pro>=t){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            } 
            ans[i]=p.length-l;
        }
        return ans;
    }
}
