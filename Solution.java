public class Solution {
  public int solution(int number) {
    int[] arr = new int[number];
    int count = 1;
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      arr[i] += count;
      count++;
    }
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] % 3 == 0 || arr[i] % 5 == 0) {
        sum += arr[i];
      }
    }
    return sum;
  }
}

//OR

public class Solution {
  public int solution(int number) {
    int sum = 0;
    for (int i = 0; i < number; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum += i;
      }
    }
    return sum;
  }
}
