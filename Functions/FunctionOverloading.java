
public class FunctionOverloading {

      //-----function overloading using parameters-----
      //func to call sum of 2nums
      public static int sum(int a , int b){
          return a + b;
      }

      //func to call sum of 3nums
      public static int sum(int a , int b , int c){
          return a + b + c;
      }

      //-----function overloading using datatype-----
      //function to call int add
      public static int add(int a, int b){
            return a + b;
      }

      //function to call float add
      public static float add(float a, float b){
            return a + b;
      }
     public static void main (String args[]){
      //calling sum function 
      // System.out.println(sum(2, 5));
      // System.out.println(sum(2,3,5));

      //calling add function
      System.out.println(add(5, 4));
      System.out.println(add(8.5f, 7.8f));
     } 
}
