class Solution {

    public class Pair{
        int index;
        int height;

        public Pair(int index, int height){
            this.index = index;
            this.height = height;
        }
    }

    public int largestRectangleArea(int[] heights) {
        
        int n = heights.length;

        Stack<Pair> st = new Stack<>();
        st.push(new Pair(0,heights[0]));
        int maxArea = heights[0];
        for(int i=1;i<n;i++)
        {
            int start = i;
            while(!st.isEmpty() && st.peek().height > heights[i])
            {
                Pair p = st.pop();
                int lastIndex = p.index;
                maxArea = Math.max(maxArea, (i-lastIndex)*p.height);
                start = lastIndex;
            }
            st.push(new Pair(start, heights[i]));
        }

        while(!st.isEmpty())
        {
            Pair p = st.pop();
            int index = p.index;
            int height = p.height;

            maxArea = Math.max(maxArea, height*(n-index));
        }
        return maxArea;
    }
}
