public class BinarySearch {
      public static int binarySearch(int numbers[], int key) {
            int start = 0, end = numbers.length-1;
            System.out.println("end is: "+ end);

            while (start<=end){
                  int mid = (start + end) / 2;

                  if(numbers[mid] == key){
                        return mid;
                  }
                  if(numbers[mid] < key){
                        start = mid + 1;
                  }else{
                        end = mid - 1;
                  }
            }
            return -1;
      }
      public static void main(String[] args) {
            int numbers[] = {29, 45, 59, 65, 78, 85};
            int key = 85;
            System.out.println(" index for key is : " + binarySearch(numbers, key));
      }
}
