import java.util.*;

public class ArrayUtilite {

	public int[] changeSize(int[] mainArray, int newSize) {
		int[] array = new int[newSize];
		if (!isNull(mainArray)) {
			for (int i = 0; i < newSize; i++) {
				if (mainArray.length != i) {
					array[i] = mainArray[i];
				} else {
					break;
				}
			}
			return array;
		} else {
			return array;
		}
	}

	public void shuffle(int[] array) {
		Random rnd = new Random();
		for (int i = array.length - 1; i > 0; i--) {
			int index = rnd.nextInt(i + 1);
			int a = array[index];
			array[index] = array[i];
			array[i] = a;
		}
	}

	private boolean isNull(int[] data) {
		if (data == null) {
			return true;
		} else {
			return false;
		}
	}

	public void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public boolean equal(int[] first, int[] second) {
		boolean check = true;
		if (first.length == second.length) {
			Arrays.sort(first);
			Arrays.sort(second);
			for (int i = 0; i < first.length; i++) {
				if (first[i] != second[i]) {
					check = false;
					break;
				}
			}
		} else return false;
		return check;
	}
}
