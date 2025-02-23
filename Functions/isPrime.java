package Functions;

public class isPrime {

      public static boolean isPrime(int n){
            if(n == 2){
                  return true;
            }
            for(int i=2; i<=Math.sqrt(n); i++){ //less optimized way is i<=n-1
                  if(n % i == 0){
                        return false;
                  }
            }
            return true;
      }

      //isPrime in range
      public static void isPrimeInRange(int n){
            for(int i=2; i<=n; i++){
                  if(isPrime(i)){
                        System.out.print(i+" ");
                  }
            }
            System.out.println();
      }
      public static void main (String args[]){
            // System.out.println(isPrime(12));
            isPrimeInRange(100);
      }
}
