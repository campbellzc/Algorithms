public class BubbleSort {
	public static void main(String[] args) {
		int[] test = {88, 69, 10, -2, 12, 99};
		test = sort(test);
		print(test);

	}
	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
	public static boolean isSorted(int[] a) {
		
		
		for (int i = 0; i < a.length-1; i++) {
			if (a[i] > a[i+1]) {
				return false;
			}
		}
		return true;
	}
	public static int[] sort(int[] a) {
		
		for (int i = 0; i < a.length-1; i++) {
			if (a[i] > a[i+1]) {
				int temp = a[i+1];
				
				a[i+1] = a[i];
				a[i] = temp;
				print(a);
				
				
			}
		}
		System.out.println();
		if (isSorted(a)) {
			return a;

		} else {
			sort(a);
			System.out.println();
		}
		
		
		return a;
	}
}