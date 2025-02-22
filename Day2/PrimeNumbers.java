
import java.util.*;
public class PrimeNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 2){
            System.out.println("It is a prime number");
        } 
        else{
            boolean isPrime = true;
            for(int i=2; i<=n-1; i++){
                if(n % i == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
                System.out.println("It is a Prime Number");
            }
            else{
                System.out.println("It is not a prime number");
            }
        }
    }
}
