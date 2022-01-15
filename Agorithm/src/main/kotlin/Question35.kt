fun main(args: Array<String>) {

}

/**
 * 题解：
 * https://programmercarl.com/0035.%E6%90%9C%E7%B4%A2%E6%8F%92%E5%85%A5%E4%BD%8D%E7%BD%AE.html
 */
fun searchInsert(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size-1;
    while(left<=right){
        var middle = left + ((right - left)/2)
        if(target > nums[middle]){
            left = middle+1
        }else if(target<nums[middle]){
            right = middle - 1
        }else{
            return  middle;
        }
    }
    return right + 1
}