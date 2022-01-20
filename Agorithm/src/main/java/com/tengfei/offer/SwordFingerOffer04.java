package com.tengfei.offer;

/**
 * 剑指 Offer 04. 二维数组中的查找
 * https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/
 */
public class SwordFingerOffer04 {

    public static void main(String[] args) {

    }

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int i = matrix.length - 1;
        int j = 0;
        while (i>=0&&j<matrix[0].length){
            if (matrix[i][j]>target){
                i--;
            }else if (matrix[i][j]<target){
                j++;
            }else{
                return true;
            }
        }
        return false;
    }

}
