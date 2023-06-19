package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        // Printing the top edge of the rectangle
        for(int i=0; i<length; i++) {
            System.out.print("8");
        }
        System.out.println();

        // Printing the sides of the rectangle
        for(int i=1; i<height-1; i++) {
            System.out.print("8");
            for(int j=1; j<length-1; j++) {
                System.out.print(" ");
            }
            System.out.println("8");
        }

        // Printing the bottom edge of the rectangle
        for(int i=0; i<length; i++) {
            System.out.print("8");
        }
        System.out.println();
    }
}
