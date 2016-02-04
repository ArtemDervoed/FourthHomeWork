import java.lang.*;
import java.util.Arrays;
import java.util.Random;

public class ArrayUtilite {

    public int[] changeSize(int[] mainArray, int newSize) throws Exception {
        int[] array = null;
        int size;
        try {
            size = newSize;
            array = new int[size];
        } catch (NullPointerException e) {
            return array = new int[0];
        }
            for (int i = 0; i < newSize; i++) {
                if (mainArray.length != i) {
                    array[i] = mainArray[i];
                } else {
                    break;
                }
            }
        return array;
    }

    public int[] filter(int[] worker, Predicate predicate, int number) throws Exception {
        try {

            if (predicate.getType() == 0) {
                return predicate.divadedOn(worker, number);
            }
            if (predicate.getType() == 1) {
                return predicate.moreThan(worker, number);
            }
            if (predicate.getType() == 2) {
                return predicate.lessThan(worker, number);
            }
            return worker;
        } catch (IllegalArgumentException e) {
            return new int[0];
        }
    }

    public int[] cut(int[] elements, int limit) {
        int[] worker = null;
        try {
            int count = 0;
            for (int i = 0; i < elements.length; i++) {
                if (elements[i] < limit) {
                    count++;
                }
            }
            worker = new int[count];
            for (int i = 0; i < elements.length; i++) {
                int index = 0;
                if (elements[i] < limit) {
                    worker[index] = elements[i];
                    index++;
                }
            }

        } catch (Exception e) {
            System.out.println("Error");
        }
        return worker;
    }

    public int[] shuffle(int[] array) throws Exception {
        int[] worker = new int[0];
        try {
            worker = array.clone();
        } catch (NullPointerException e) {
            System.out.println("Error");
        }
        Random rnd = new Random();
        for (int i = worker.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int a = worker[index];
            worker[index] = worker[i];
            worker[i] = a;
        }

        return worker;

    }

    public void print(int[] array) throws NullPointerException {
        try {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        } catch (NullPointerException e) {
            System.out.println("Пустой массив");
        }
    }

    public boolean equal(int[] first, int[] second) throws Exception {
        boolean check = true;
        try {
            if (first.length == second.length) {
                Arrays.sort(first);
                Arrays.sort(second);
                for (int i = 0; i < first.length; i++) {
                    if (first[i] != second[i]) {
                        check = false;
                        break;
                    }
                }
            } else {
                return false;
            }
        } catch (NullPointerException e) {
            System.out.println("Error");
        }
        return check;
    }
}
