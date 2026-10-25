class Solution {
    public int maxArea(int[] heights) 
    {
        int left=0,maxarea=0,area=1;
        int right=heights.length-1;
        while(left<right)
        {
            area=Math.min(heights[left],heights[right])*(right-left);
            if(maxarea<area)
            {
                maxarea=area;
            }
            if(heights[left] < heights[right])
            {
                left++;
            }
            else
            {
                right--;
            }

        }
        return maxarea;
    }
}
