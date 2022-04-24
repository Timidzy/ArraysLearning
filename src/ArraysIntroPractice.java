import java.util.Arrays;

public class ArraysIntroPractice {
    public static void main(String[] args) {
        int[] array = new int[]{1, 4, 8, 10};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            array[i] += 10;
            System.out.print(array[i] + "\t");
        }
        System.out.println();

        array = new int[]{1, 4, 8, 10};
        for (int i = 0; i < array.length; i++) {
            array[i] *= 5;
            System.out.print(array[i] + "\t");
        }
        System.out.println();

        array = new int[]{1, 4, 8, 10};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + "\t");
            }
        }
        System.out.println();

        array = new int[]{1, 4, 8, 10};
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        System.out.println(result);

        array = new int[]{1, 4, 8, 10};
        result = 1;
        for (int i = 0; i < array.length; i++) {
            result *= array[i];
        }
        System.out.println(result);
        int[] arrayTwo = new int[array.length];
        for (int i = 0; i < array.length; i++){
            int j = i;
            arrayTwo[i] = array[i];
            System.out.print(arrayTwo[i] + "\t");
        }
        System.out.println();
        array = new int[]{1, 4, 8, 10};
        arrayTwo = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--){
            arrayTwo[i] = array[i];
            System.out.print(arrayTwo[i] + "\t");
        }
    }
}
