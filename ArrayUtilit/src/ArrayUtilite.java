import java.util.*;
import java.lang.*;

public class ArrayUtilite {

    public int[] changeSize(int[] mainArray, int newSize) {
        int[] array = new int[newSize];
        try {
            for (int i = 0; i < newSize; i++) {
                if (mainArray.length != i) {
                    array[i] = mainArray[i];
                } else {
                    break;
                }
            }
            return array;
        } catch (ExceptionInInitializerError e) {
            e.getException();
            return array;
        }
    }

    public int[] cut(int[] elements, int limit) {
        int count = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] < limit) {
                count++;
            }
        }
        int[] worker = new int[count];
        for (int i = 0; i < elements.length; i++) {
            int index = 0;
            if (elements[i] < limit) {
                worker[index] = elements[i];
                index++;
            }
        }
        return worker;
    }

    @SuppressWarnings("finally")
    public int[] shuffle(int[] array) {
        try {
            Random rnd = new Random();
            for (int i = array.length - 1; i > 0; i--) {
                int index = rnd.nextInt(i + 1);
                int a = array[index];
                array[index] = array[i];
                array[i] = a;
            }
        } catch (Exception e) {
        e.getMessage();
        } finally {
            return array;
        }
    }

    public void print(int[] array) {
        try {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public boolean equal(int[] first, int[] second) {
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
            } else
                return false;
        } catch (Exception e) {
            e.getMessage();
        }
        return check;
    }
}
