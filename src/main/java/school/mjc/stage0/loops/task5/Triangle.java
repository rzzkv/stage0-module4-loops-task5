package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        // Printing the triangle
        for(int i=0; i<cathetusLength; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }

        // Printing the rectangle
        for(int i=0; i<cathetusLength-1; i++) {
            for(int j=0; j<cathetusLength; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
