import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        int [] numberI = new int [3];
        numberI [0] = 1;
        numberI [1] = 2;
        numberI [2] = 3;
//        System.out.println(Arrays.toString(numberI));
        double [] numberD = {1.57, 7.654, 9.986};
//        System.out.println(Arrays.toString(numberD));
        char [] name = {'D', 'a', 'r', 'i', 'a'};
//        System.out.println(Arrays.toString(name));

        //Task 2
        System.out.println("\nTask 2");
        for (int i = 0; i < numberI.length; i++) {
            System.out.print(numberI[i]);
            if (i != numberI.length - 1)
            {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < numberD.length; i++) {
            System.out.print(numberD[i]);
            if (i != numberD.length - 1)
            {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i]);
            if (i != name.length - 1)
            {
                System.out.print(", ");
            }
        }

        //Task 3
        System.out.println("\nTask 3");
        for (int i = numberI.length-1; i >= 0; i--) {
            System.out.print(numberI[i]);
            if (i != 0)
            {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = numberD.length-1; i >= 0; i--) {
            System.out.print(numberD[i]);
            if (i != 0)
            {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = name.length-1; i >= 0; i--) {
            System.out.print(name[i]);
            if (i != 0)
            {
                System.out.print(", ");
            }
        }

        //Task 4
        System.out.println("\nTask 4");
        int [] massive = numberI;
        System.out.println(Arrays.toString(massive));
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2 != 0)
            {
                massive[i]++;
            }
        }
        System.out.println(Arrays.toString(massive));
    }
}