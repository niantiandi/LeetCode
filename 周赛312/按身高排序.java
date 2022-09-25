package 周赛312;

public class 按身高排序{
    public String[] sortPeople(String[] names, int[] heights) {
        int trans=0;
        String trans_2;
        for (int i = 0; i < heights.length-1; i++) {
            for (int j = 0; j < heights.length-i-1; j++) {
                if(heights[j+1]>heights[j]){
                    trans=heights[j];
                    heights[j]=heights[j+1];
                    heights[j+1]=trans;
                    trans_2=names[j];
                    names[j]=names[j+1];
                    names[j+1]=trans_2;
                }
            }
        }
        return names;
    }
}