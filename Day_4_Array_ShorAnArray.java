public class Day_4_Array_ShorAnArray {
  public static void sortColors(int[] nums) {
    int low = 0, mid = 0, high = nums.length - 1;

    while (mid <= high) {
      switch (nums[mid]) {
        case 0:
          int temp = nums[low];
          nums[low++] = nums[mid];
          nums[mid++] = temp;
          break;
        case 1:
          mid++;
          break;
        case 2:
          temp = nums[mid];
          nums[mid] = nums[high];
          nums[high--] = temp;
          break;
      }
    }
  }

  public static void main(String[] args) {
    int[] nums = { 2, 0, 2, 1, 1, 0 };
    sortColors(nums);
    for (int num : nums)
      System.out.print(num + " ");
  }
}
