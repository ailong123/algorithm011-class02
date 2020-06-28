//给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, 
//ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。 
//
// 说明：你不能倾斜容器，且 n 的值至少为 2。 
//
// 
//
// 
//
// 图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。 
//
// 
//
// 示例： 
//
// 输入：[1,8,6,2,5,4,8,3,7]
//输出：49 
// Related Topics 数组 双指针


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public static int maxArea(int[] height) {
        int length = height.length;
        int maxArea = 0;

        for (int i = 0, j = length - 1; i < j;) {
            int minHeight = height[i] < height[j] ? height[i++] : height[j--];
            int area = (j - i + 1) * minHeight;
            maxArea = Math.max(area, maxArea);
        }

        return maxArea;
    }

//    public static int maxArea(int[] height) {
//        int length = height.length;
//        int maxArea = 0;
//        for (int i = 0; i < length; i++) {
//            for (int j = i + 1; j < length; j++) {
//                int area = getArea(height, i, j);
//                maxArea = Math.max(area, maxArea);
//            }
//        }
//        return maxArea;
//    }
//
//    private static int getArea(int[] height, int i, int j) {
//        return (j - i) * Math.min(height[i], height[j]);
//    }


}
//leetcode submit region end(Prohibit modification and deletion)
