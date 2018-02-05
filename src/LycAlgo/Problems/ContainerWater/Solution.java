package LycAlgo.Problems.ContainerWater;


public class Solution {
    public int maxArea2(int[] height) {

        if(height == null || height.length == 1) return 0;
        if(height.length == 2) return Math.min(height[0] , height[1]);

        int max1 = 0;
        int max2 = 0;
        int k = 0;
        int tmp = -1;
        for(int i = 0 ; i < height.length ;i++) {
            if(height[i] > tmp){
                max1 = i;
                tmp = height[i];
                k = i;
            }
        }

        tmp = -1;
        for(int j = 0 ; j < height.length ;j++) {
            if(j!=k && height[j] >tmp){
                max2 = j;
                tmp = height[j];
            }
        }

        int left = 0;
        int rigth = height.length - 1;

        int init = Math.min(height[left] , height[rigth]) * (rigth - left);

        for(int i = left ; i < rigth ; i++) {
            if(height[i]<= height[left]) continue;
            if(Math.min(height[i],height[rigth]) * (rigth - i) > init){
                init = Math.min(height[i],height[rigth]) * (rigth - i);
                left = i;
            }
        }

        for(int j = rigth ; j > left ; j--) {
            if(height[j]<= height[rigth]) continue;
            if(Math.min(height[j],height[left]) * (j - left) > init){
                init = Math.min(height[j],height[left]) * (j - left);
                rigth = j;
            }
        }

        int tmp2 = height[max2] * Math.abs(max1 - max2);

        return tmp2 > Math.min(height[left] , height[rigth]) * (rigth - left) ? tmp2 :  Math.min(height[left] , height[rigth]) * (rigth - left) ;

    }

    public int maxArea(int[] height) {
        if(height == null || height.length == 1) return 0;
        if(height.length == 2) return Math.min(height[0] , height[1]);
        int left = 0;
        int rigth = height.length - 1;
        int maxarear = 0;
        while (left < rigth ){

            if(height[left] < height[rigth]){
                if(height[left]*(rigth-left) > maxarear){
                    maxarear = height[left] * (rigth - left);
                }
                left++;
            }else {
                if(height[rigth]*(rigth-left) > maxarear){
                    maxarear = height[rigth] * (rigth - left);
                }
                rigth--;
            }

        }
        return maxarear;

    }

}
