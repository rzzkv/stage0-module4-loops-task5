package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
// Printing the top edge of the square
        for(int i=0; i<sideLength; i++) {
            System.out.print("8");
        }
        System.out.println();

        // Printing the sides of the square
        for(int i=1; i<sideLength-1; i++) {
            System.out.print("8");
            for(int j=1; j<sideLength-1; j++) {
                System.out.print(" ");
            }
            System.out.println("8");
        }

        // Printing the bottom edge of the square
        for(int i=0; i<sideLength; i++) {
            System.out.print("8");
        }
        System.out.println();
    }
}
