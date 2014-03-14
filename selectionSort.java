public class selectionSort {
	public static void main(String[] args) {
		int[] test = {3, 1, 6, 7, 1, 2};
		//sort(test);
		print(sort(test));
		if (isSorted(test)) {
			System.out.println("WOOOOHOOOOO");
		}
	}
	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
	public static boolean isSorted(int[] a) {
		
		
		for (int i = 1; i < a.length-1; i++) {
			if (a[i] > a[i+1]) {
				return false;
			}
		}
		return true;
	}
	public static int[] sort(int[] a) {
		
		int minIndex = 0;
		for (int i = 0; i < a.length-1; i++) {
			minIndex = i;
			for (int j = i+1; j < a.length; j++) {
				if(a[j] < a[minIndex]) {
					minIndex = j;
				}
				
			}
			if (minIndex != i) {
				int temp = a[i];
				a[i] = a[minIndex];
				a[minIndex] = temp;
				
				print(a);
				System.out.println();
			}
		}
		return a;
	}
}