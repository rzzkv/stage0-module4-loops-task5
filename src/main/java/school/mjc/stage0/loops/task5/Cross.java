package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {

        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                // check if on horizontal or vertical line
                if (i == sideLength / 2 || j == sideLength / 2) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
//2. Cross. Write a program that will write to console a cross of a given size(it should consist of '8'-s).