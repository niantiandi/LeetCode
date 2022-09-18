package 周赛311;

public class 最长的字母序连续子字符串的长度 {
    public int longestContinuousSubstring(String s) {
        int flag=1;
        char trans[]=s.toCharArray();
        int res[]=new int[trans.length];
        for(int i=0;i<res.length;i++){
            res[i]=(int)trans[i];
        }
        if(res.length==1){
            return 1;
        }
        
        else{
            
            for(int m=0;m<res.length-1;m++){
                for(int n=1;n<res.length;n++){
                    int distance=0;
                    distance=res[n]-res[m];
                    if(distance==1){
                        flag++;
                    }
                }
            }
            return flag;
            
        }
        
        
    }


    public int longestContinuousSubstring_coppyright(String s) {
        int max=0;
        int flag=1;

        for(int i=1;i<s.length();i++){
            char pre = s.charAt(i-1);
            char now = s.charAt(i);
            if(now-pre==1){
                flag++;
            }

            else{
                max=(max>flag?max:flag);
                flag=1;
            }
        }
        max=(max>flag?max:flag);
        return max;
    }
}
