package com.leetcode.solvingproblems.offer;

/**
 * @author by tengfei on 2020/3/5.
 * @description： 面试题04. 二维数组中的查找
 */
public class Offer$$4 {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int i = matrix.length - 1;
        int j = 0;
        while (i >= 0 && j <= matrix[0].length - 1) {
            if (matrix[i][j] > target) {
                i--;
            } else if (matrix[i][j] < target) {
                j++;
            }else {
                return true;
            }
        }
        return false;
    }
}
