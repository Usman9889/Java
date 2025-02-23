package Functions;
// import java.util.*;
public class Functions {
    public static void PrintHello(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    public static int calculateSum(int num1, int num2){ //Parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    }
    //product of a and b
    public static int multiply(int a , int b){
        int product = a * b;
        return product;
    }

    //factorial
    public static int factorial(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f * i;
        }
        return f;
    }

    //Binomial coefficient
    public static int binCoeff(int n, int r){
        int n_fac = factorial(n);
        int r_fac = factorial(r);
        int nmr_fac = factorial(n-r);

        int coefficiant = n_fac / (r_fac * nmr_fac );
        return coefficiant;
    }

    public static void main (String args[]){
        // PrintHello();
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateSum(a,b);  // Arguments or actual paramenters
        // System.out.println(sum);
        // sum = calculateSum(2, 4);
        // System.out.println("sum of 2 and 4 is " + sum);

        //multiply()
        // int result = multiply(4, 5);
        // System.out.println(result);

        //calling factorial
        // System.out.println(factorial(4));

        //calling binomial coefficient
        System.out.println(binCoeff(5, 2));
    }
}
