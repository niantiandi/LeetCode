package 力扣杯秋季编程大赛.个人;
public class 气温变化趋势 {
    public int temperatureTrend(int[] temperatureA, int[] temperatureB) {
        int changeA[]=new int [temperatureA.length-1];
        for (int i = 0; i < changeA.length; i++) {
            if(temperatureA[i+1]-temperatureA[i]>0){
                changeA[i]=1;
            }
            else if(temperatureA[i+1]-temperatureA[i]==0){
                changeA[i]=0;
            }
            else
            changeA[i]=-1;
        }
        int changeB[]=new int [temperatureB.length-1];
        for (int i = 0; i < changeB.length; i++) {
            if(temperatureB[i+1]-temperatureB[i]>0){
                changeB[i]=1;
            }
            else if(temperatureB[i+1]-temperatureB[i]==0){
                changeB[i]=0;
            }
            else
            changeB[i]=-1;
        }

        int flag[]=new int[changeA.length];
        for (int i = 0; i < flag.length; i++) {
            if(changeA[i]==changeB[i]){
                flag[i]=1;
            }
            else
            flag[i]=0;
        }
        int result[]=new int[flag.length];
        for (int i = 0; i < result.length; i++) {
            result[i]=0;
        }
        int trans=0;
        for (int i = 0; i < flag.length; i++) {
            if(flag[i]==1){
                result[trans]++;
            }
            else
            trans++;
        }
        int max_result=0;
        for (int i = 0; i < result.length; i++) {
            if(result[i]>max_result){
                max_result=result[i];
            }
        }
        return max_result;
    }
}
