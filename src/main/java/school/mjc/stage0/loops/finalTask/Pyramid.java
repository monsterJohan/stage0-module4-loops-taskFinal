package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            int number = i;
            for (int j = 1; j <= cathetusLength * 2 - 1; j++) {
                if (j <= cathetusLength - i) {
                    System.out.print(" ");
                } else if (j >= cathetusLength + i) {
                    continue;
                } else {
                    System.out.print(number);
                    if (j <= (cathetusLength * 2 - 1) / 2) {
                        number--;
                    } else {
                        number++;
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
