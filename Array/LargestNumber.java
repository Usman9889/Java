public class LargestNumber {

      public static int largest(int numbers[]){
            int largest = Integer.MIN_VALUE; // -infinity
            int smallest = Integer.MAX_VALUE; 
            for(int i=0; i<numbers.length; i++){
                  if(largest < numbers[i]){
                        largest = numbers[i];
                  }
                  if (smallest > numbers[i]) {
                        smallest = numbers[i];
                  }
            }
            System.out.println("Smallest number is : " + smallest);
            return largest;
      }
      public static void main(String[] args){
            int numbers [] = {12, 48, 56, 25, 14, 9};

            System.out.println("largest number is: " + largest(numbers));
      }
}
