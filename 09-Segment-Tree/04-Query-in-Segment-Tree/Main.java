import javax.swing.text.Segment;

/*
 * @Author: your name
 * @Date: 2022-03-20 22:32:54
 * @LastEditTime: 2022-03-21 20:52:39
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\09-Segment-Tree\03-Building-Segment-Tree\Main.java
 */
public class Main {
    public static void main(String[] args){

        Integer[] nums = {4,3,-1,-6,2,6};
        SegmentTree<Integer> segTree = new SegmentTree<>(nums,(a,b) -> a + b);

        System.out.println(segTree.query(0, 2));
        System.out.println(segTree.query(3, 5));
    }
}
