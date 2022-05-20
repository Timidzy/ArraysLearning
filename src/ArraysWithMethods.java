import java.util.Arrays;

public class ArraysWithMethods {
    public static void main(String[] args) {
        int[] array = new int[]{34, 55, -1, -9, 24, 13};
        System.out.println(firstNumOfArray(array));
        System.out.println(lastNumOfArray(array));
        System.out.println(minNumOfArray(array));
        System.out.println(maxNumOfArray(array));
        System.out.println(sumOfArray(array));
        System.out.println(productOfArray(array));
        System.out.println(Arrays.toString(array));
        bubbleSort(array);

    }

    static int firstNumOfArray(int... array) {
        return array[0];
    }

    static int lastNumOfArray(int... array) {
        return array[array.length - 1];
    }

    static int minNumOfArray(int... array) {
        int tmp = 0;
        for (int i : array) {
            if (tmp > i) {
                tmp = i;
            }
        }
        return tmp;
    }

    static int maxNumOfArray(int... array) {
        int tmp = 0;
        for (int i : array) {
            if (tmp < i) {
                tmp = i;
            }
        }
        return tmp;
    }

    static int sumOfArray(int... array) {
        int tmp = 0;
        for (int i : array) {
            tmp += i;
        }
        return tmp;
    }

    static int productOfArray(int... array) {
        int tmp = 1;
        for (int i : array) {
            tmp *= i;
        }
        return tmp;
    }

    static void bubbleSort(int... array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }


}
