import java.util.*;

public class ArrayCC {

      public static void update(int marks[]){
            for(int i=0; i<marks.length; i++  ){
                  marks[i] = marks[i] + 1;
            }
      }

      public static void main(String[] args) {

            int marks[] = {63, 85, 92};
            update(marks);
            // printing the marks
            for(int i=0; i<marks.length; i++){
                  System.out.print(marks[i] + " ");
            }
            System.out.println();
            //
            // int marks[] = new int[10];

            // Scanner sc = new Scanner(System.in);
            // marks[0] = sc.nextInt();
            // marks[1] = sc.nextInt();
            // marks[2] = sc.nextInt();

            // System.out.println("physics: " + marks[0]);
            // System.out.println("chemistry: " + marks[1]);
            // System.out.println("maths: " + marks[2]);

            // marks[2] = sc.nextInt();
            //or marks[2] = 92 or marks[2] = marks[2] + 1 
            // System.out.println("maths updated: " + marks[2]);

            // int Percentage = (marks[0]+marks[1]+marks[2]) / 3;
            // System.out.println("Percentage: " + Percentage + "%");

      }
}