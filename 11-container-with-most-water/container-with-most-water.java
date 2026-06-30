class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxarea=0;
        while(left<right){
            int hei=Math.min(height[left],height[right]);
            int width=right-left;
            int area=width*hei;
            maxarea=Math.max(maxarea,area);
            if(height[left]<height[right]) left++;
            else right--;
        }
        return maxarea;
    }
}
/*
    firsly create two pointers one for left and other for right wall
    continue moving the pointers along with find aread each time to do this
    first findout min hight among the two walls because the wall needa hold the water if u choose bigger height then it may overflow thats why u havta choose smaller height then find out width with basic formula right - left and find out the max area compare the area with max area and if left wall is smaller than right wall in term of height then move left wall otherwise right wall, just one wall at a time until condition satisfies
*/