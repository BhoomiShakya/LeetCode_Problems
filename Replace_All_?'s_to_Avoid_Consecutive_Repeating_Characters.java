class Solution {
    public String modifyString(String s) {
         if(s.equals("?")){
            return "a";
        }
        char []arr= s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='?'){
                if(i==0){
                    for(char c='a';c<='z';c++){
                        if(c != arr[i+1]){
                            arr[i]=c;
                            break;
                        }
                    }
                }
                else if(i==arr.length-1){
                    for(char c='a' ; c<='z';c++){
                        if(c!=arr[i-1]){
                            arr[i]=c;
                            break;
                        }
                    }
                }
                else{
                    for(char c='a' ; c<='z';c++){
                        if(c!=arr[i+1]&& c!=arr[i-1] ){
                            arr[i]=c;
                            break;
                        }
                    }
                }
            }
        }
        return new String(arr);
    }
}
