package Functions;

public class decToBin {
      public static void decToBin(int dec){
            int num = dec;
            int pow = 0;
            int binNum = 0;

            while(dec > 0){
                int rem = dec % 2;
                  binNum = binNum + (rem * (int)Math.pow(10, pow));
                  pow++;
                  dec = dec / 2;
            }
            System.out.println("Binary of " + num + " is "+ binNum);
      }
      public static void main (String args[]){
            decToBin(7);
      }
}
