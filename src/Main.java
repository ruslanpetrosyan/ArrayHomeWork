public class Main {
    public static void main(String[] args) {
        System.out.println("Массивы Часть - 1");
        System.out.println("  Задача - 1, 2");
        int [] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        double [] array1 = {1.57, 7.654, 9.986};
        int [] arbitrary = new int[4];
        arbitrary[0] = 2;
        arbitrary[1] = 4;
        arbitrary[2] = 3;
        arbitrary[3] = 1;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            if (i != array1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arbitrary.length; i++) {
            System.out.print(arbitrary[i]);
            if (i != arbitrary.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("  Задача - 3");

        for (int i = array.length - 1; i >=0; i--) {
            System.out.print(array[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = array1.length - 1; i >=0; i--) {
            System.out.print(array1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = arbitrary.length - 1; i >=0; i--) {
            System.out.print(arbitrary[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("  Задача - 4");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                array[i]++;
            }
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

    }
}