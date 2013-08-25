
public class MergeSort {
	public static void main (String args[])
	{
		int[] test = {25, 20, 11, 45, 3, 48, 33, 2};
		sort (test);
		for (int i = 0; i < test.length; i++)
		{
			System.out.print(test[i] + " ");
		}
		


		
	}
	public static void sort (int [] array) {
		if (array.length > 1) {
			int half = array.length /2;
			int[] a1 = subarray(array, 0 , half);
			int [] a2 = subarray (array, half, array.length);
			sort (a1);
			sort (a2);
			merge (array, a1, a2);
		}
	}
	private static void merge(int []array, int[] a1, int[]a2){
		int n1 = a1.length;
		int n2 = a2.length;
		int i1 = 0;
		int i2 = 0;
		for (int i = 0; i < array.length; i++) {
			if (i2 == n2 || (i1 < n1 && a1[i1] < a2[i2])) {
				array[i] = a1[i1];
				i1++;
			}
			else {
				array[i] = a2[i2];
				i2++;
			}
		}
	}
	private static int [] subarray (int [] array, int p1, int p2)
	{
		int [] result = new int[p2-p1];
		for (int i = p1; i < p2; i++)
		{
			result[i - p1] = array[i];
		}
		return result;
	}
}
