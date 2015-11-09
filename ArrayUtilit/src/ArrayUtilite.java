import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtilite {

	public int[] changeSize(int []mainArray,int newSize){
		int[] array = new int[newSize];
		for(int i=0;i<newSize;i++)
		{
			array[i]=mainArray[i];
		}
		return array;
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
	
	public void print(int[]array)
	{
		for(int i =0; i<array.length;i++){
		System.out.print(array[i]+" ");
		}
	}
	private static int[]sort(int []array){
		for (int i=array.length-1; i>=0; i--) {
		    for (int j=0; j<i; j++){
		      if (array[j] > array[j+1]){
		        int tmp = array[j];
		        array[j] = array[j+1];
		        array[j+1] = tmp;
		      }
		    }
		  }
		return array;
	}
	public boolean equls(int[]first, int[]second)
	{
		if(first.length == second.length){
			if(sort(first)==sort(second)){
			return true;
			}
			else{
				return false;
			}
		}
		else return false;		
	}
	
}
