public class Day_3_Array_LargestNo {
  public static void main(String[] args) {
    int[] arr = { 10, 20, 4, 45, 99 };
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int num : arr) {
      if (num > largest) {
        secondLargest = largest;
        largest = num;
      } else if (num > secondLargest && num != largest) {
        secondLargest = num;
      }
    }

    System.out.println("Second Largest: " + secondLargest);
  }
}
