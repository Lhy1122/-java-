/*
 * @Author: your name
 * @Date: 2022-03-21 21:00:57
 * @LastEditTime: 2022-03-21 21:37:19
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\09-Segment-Tree\05-Segment-Tree-Problems-in-Leetcode\NumArray.java
 */
public class NumArray {

    private SegmentTree<Integer> segmentTree;

    public NumArray(int[] nums){

        if(nums.length > 0){
            Integer[] data = new Integer[nums.length];
            for(int i = 0; i < nums.length; i++)
                data[i] = nums[i];
            segmentTree = new SegmentTree<>(data, (a, b) -> a + b);
        }
    }

    public int sumRange(int i, int j){

        if(segmentTree == null)
            throw new IllegalArgumentException("Segment Tree is null.");

        return segmentTree.query(i, j);

    }
}
