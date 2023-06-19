package school.mjc.stage0.loops.task5;
import java.util.Scanner;

public class CrossTest {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter size of square: ");
         int size = scanner.nextInt();

         // Print top edge
         for (int i = 0; i < size; i++) {
             System.out.print("8");
         }
         System.out.println();

         // Print sides
         for (int i = 0; i < size - 2; i++) {
             System.out.print("8");
             for (int j = 0; j < size - 2; j++) {
                 System.out.print(" ");
             }
             System.out.println("8");
         }

         // Print bottom edge
         for (int i = 0; i < size; i++) {
             System.out.print("8");
         }

        }
    }

