/**
 * https://leetcode-cn.com/problems/binary-search/
 * 704. 二分查找
 */
fun main(args: Array<String>) {

}

fun search(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size - 1;
    while(left <= right){
        var middle = left +((right - left)/2)
        if(target > nums[middle]){
            //说明target在middle的右边
            left = middle +1;
        }else if(target < nums[middle]){
            right = middle - 1;
        }else{
            return  middle;
        }

    }
    return -1;
}
